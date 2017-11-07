
public class Tabel extends AbstractElement {
	public String numeTabel;
	
	public Tabel(String numeTabel){
		this.numeTabel = numeTabel;
	}
	
	public void print() {
		System.out.println("Showing table :"+this.numeTabel);
	}

}
