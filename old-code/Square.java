
public class Square {

//final static int max = 50;
		 /** Print out the square sequence for values < 50 */
	//create an array
	
	int squareCal(){
		int x = 0;
		int [] number = {1,2,3,4,5,6,7,8,9,100};
			for (int i=1; i<number.length; i++){
				x = i*i;
				System.out.println(x);
			
			}
			return x;
	}
			
			
			
	public static void main(String [] args){
	 Square s1 = new Square();
		s1.squareCal();
	 
	}
}