
public class LanguageCon {
String name;

public LanguageCon(){
	System.out.println("Con-1");
	}
public LanguageCon(String t){
	name = t;
}
void setName(String t){
	name = t;
}
void getName(){
	System.out.println("lang name" +name);
}
public static void main(String[] args){
	LanguageCon c1 = new LanguageCon();
	LanguageCon c2 = new LanguageCon("JAVA");
	c1.setName("C++");
	
	c2.getName();
	c1.getName();
	
}
}