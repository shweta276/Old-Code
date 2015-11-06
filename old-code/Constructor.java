class Machine {
 private String name;
 private int code;
 
public Machine(){
	System.out.println("first cons");
}
public Machine(String name){
	this.name=name;
	System.out.println("second cons");
	}
public Machine(String name, int code){
	this.name = name;
	this.code = code;
	System.out.println("third cons");
 }
}

public class Constructor{
	public static void main(String[] args){
		Machine s1 = new Machine();
		Machine s2 = new Machine("sachin");
		Machine s3 = new Machine("sachin", 9);
		
		
	}
}

