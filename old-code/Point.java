
// Add a method to the Point class that sets the current 
//object's coordinates to those of a passed in Point object.
//create a method to pass current paremeters

public class Point {
	
	int x ;
	int y;
	
//public Point (int x, int y){
	//this.x = x;
	//this.y = y;
	//}

public void print (){
	System.out.println(x);
    System.out.println(this.y);
}
	public static void main(String [] args){
	// point objects
	Point lowerLeft = new Point();
	Point upperRight = new Point();
	Point middlePoint = new Point();
	
	lowerLeft.x = 15;
	lowerLeft.y= 100;
	
	lowerLeft.print();
	
	}
	
}