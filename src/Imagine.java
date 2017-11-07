
public class Imagine extends AbstractElement {
	public String imagePath;
	
	public Imagine(String imagePath){
		this.imagePath = imagePath;
		this.loadData(imagePath);
	}

	public void print() {
		System.out.println("Showing image from :"+this.imagePath);
	}
	
	public void loadData(String path){
		//Dummy function to act as a data loader.
	}

}
