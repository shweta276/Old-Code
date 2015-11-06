
public class Inheritance2 extends Inheritance {
	int gpa;
	int grad;
	
	public Inheritance2 (String firstname, String lastname, int gpa, int grad){
	super(firstname, lastname);
	this.gpa = gpa;
	this.grad = grad;
	
	
}
	public void print(){
		System.out.println("Student dtails:" + gpa + "" + grad);
		super.print();
	}
	
}
