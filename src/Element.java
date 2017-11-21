
public interface Element {

	public void addElement(Element elem) throws Exception;

	public void remove (Element elem);

	public  void getElement(int index);


	public void acceptVisitor(Visitor s);

	public void print();

}
