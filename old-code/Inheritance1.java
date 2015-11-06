
public class Inheritance1 extends Inheritance {
	public Inheritance1 (String firstname, String lastname){
		super(firstname, lastname);
	}
public void print(){
	System.out.println("Prof details:");
	super.print();
}
}
