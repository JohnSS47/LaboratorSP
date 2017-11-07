import java.util.ArrayList;

public class Sectiune implements ElementPagina {

	public ArrayList<ElementPagina> elemente;
	public String titlu;
	
	public Sectiune(String titlu){
		elemente = new ArrayList<ElementPagina>();
		this.titlu = titlu;
	}

	public void addElement(ElementPagina e) {
		elemente.add(e);
	}

	public void removeElement(ElementPagina e) {
		elemente.remove(e);
		
	}
	public int getElements() {
		return elemente.size();
	}

	public void print() {
		System.out.println(this.titlu);
		for(ElementPagina e : this.elemente){
			e.print();
		}
	}
	
}
