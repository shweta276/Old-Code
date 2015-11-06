
public class Swap {
	
	
	public static void main (String[] args){
		
		int x = 3;
		int y = 4;
		
		swapping(x,y);
	}
	public static void swapping( int a, int b){
	int temp = a;
		
		a = b;
		b = temp;
		System.out.println("print" + a +b);
		
	}
}
