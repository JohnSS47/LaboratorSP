import java.util.ArrayList;

public class Carte {

	private String titlu;
	private ArrayList<Autor> autori;
	private ArrayList<ElementPagina> capitole;
	private Cuprins cuprins;
	
	public AlignStrategy leftAlign = new LeftAlign();
	public AlignStrategy centerAlign = new CenterAlign();
	public AlignStrategy rightAlign = new RightAlign();
	
	public Carte(){
		this.titlu = "";
		this.autori = new ArrayList<Autor>();
		this.capitole = new ArrayList<ElementPagina>();
	}
	
	public Carte(String titlu,Cuprins cuprins){
		this.titlu = titlu;
		this.autori = new ArrayList<Autor>();
		this.capitole = new ArrayList<ElementPagina>();
		this.cuprins = cuprins;
	}
	
	public void printBook(){
		for(ElementPagina e : this.capitole){
			e.print();
		}
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public ArrayList<Autor> getAutori() {
		return autori;
	}

	public void setAutori(ArrayList<Autor> autori) {
		this.autori = autori;
	}

	public ArrayList<ElementPagina> getCapitole() {
		return capitole;
	}

	public void setCapitole(ArrayList<ElementPagina> capitole) {
		this.capitole = capitole;
	}

	public Cuprins getCuprins() {
		return cuprins;
	}

	public void setCuprins(Cuprins cuprins) {
		this.cuprins = cuprins;
	}
	
	
	
	

}
