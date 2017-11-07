
public class ImageProxy extends AbstractElement {
	
	public String fileName;
	public Imagine realImage = null;
	
	public ImageProxy(String fname){
		this.fileName = fname;	
	}
	
	public void print(){
		if(realImage == null){
			realImage = new Imagine(fileName);
		}
		realImage.print();
	}
	

}
