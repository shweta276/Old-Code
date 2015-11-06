//buffer reader object to read a line can be constor - convert into line of texts
//input stream reader need inputstream--
// to consturct input stream we need system.in -- read raw data from the keyboard

import java.io.*; // read the stuff from
import java.net.URL;

//read one line of txt from keboard and print it
public class InputKeyboard {
	//method
	
	public static void main(String[] arg) throws Exception{
		// 
		/////BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	
		////System.out.print (keyboard.readLine());
		
		//reading it from a sachin.txt
		//FileInputStream fst = new FileInputStream("C:/Users/m269766/Documents/sachin.txt");
		//DataInputStream in = new DataInputStream(fst);
		//BufferedReader br = new BufferedReader(new InputStreamReader(in));
		//String s = br.readLine();
		//System.out.println("print" + " + " +s);
		
		//printing it from a website
		
		URL u = new URL("http://www.google.com");
		InputStream x = u.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(x));
		System.out.println(br.readLine());
	
	}
	

	//another method to read from url
	

}

