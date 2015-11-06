
public class Personal {
 int x;
 int y;
 
 public Personal(){
	 x = 4;
	 y = 5;
 }
	
public Personal(int x, int y){
	this.x=x;
	this.y = y;
	System.out.println("lang name" +this.x);
	System.out.println("lang name" +this.y);
}

void setValue (int x, int y){
	this.x = x;
	this.y = y;
	
}

void getValue(){
	System.out.println(this.x);
	System.out.println(this.y);
}

		public static void main(String [] args){
		// point objects
		Personal lowerLeft = new Personal();
		Personal lowerLeft1 = new Personal(2,3);
		
		
		lowerLeft.x = 15;
		lowerLeft.y= 20;
		
		//lowerLeft.setValue(50, 100);
		lowerLeft.getValue();
		
		}
		
	}
