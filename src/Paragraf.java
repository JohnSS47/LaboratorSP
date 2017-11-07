public class Paragraf extends AbstractElement{
	
	public String text;
	public AlignStrategy alignment;
	
	public Paragraf(String text, AlignStrategy alignment){
		this.text = text;
		this.alignment = alignment;
	}
	
	public Paragraf(String text){
		this.text = text;
	}
	
	public void addText(String text){
		this.text+=text;
	}
	
	public void show(){
		System.out.println("Paragraf");
	}
	
	public void setAlign(AlignStrategy as){
		this.alignment = as;
	}

	public void print() {
		if(alignment == null){
			System.out.println("***"+ this.text);
		}
		else this.alignment.printAligned(this.text);
	}

}
