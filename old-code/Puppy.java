
public class Puppy {
	int puppyAge;
	int studid;
	double sal1;
	String col;
	
 public Puppy (String name){
	 System.out.println("passed parameter name" +  name);
 }
 public Puppy (String last_name, double sal){
	
	 System.out.println("2 parameters" + last_name);
	 System.out.println("2 parameters" + sal);
 }
 public void setAge(int age){
	 puppyAge = age;
 }
 
 public int getAge(){
	 return puppyAge;
 }
 
 public void setStudentid(int id){
	studid = id;
 }
 public int getStudentid(){
	 return studid;
 }
 
 public void setColor(String color){
	 col = color;
 }
 
 public String getColor(){
	 return col;
 }
 public static void main(String args[]){
	 Puppy obj = new Puppy("Tommy");
	 Puppy obj1 = new Puppy("Shweta", 7);
	 
	 	obj.setAge(5);
	 	obj.getAge();
	 	
	 	obj.setColor("red");
	 	obj.getColor();
	 	
	 System.out.println("age" +obj.puppyAge);
	 
	 System.out.println("color" +" " +obj.col);
	 
 }
}
