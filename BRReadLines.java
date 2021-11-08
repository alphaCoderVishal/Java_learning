package Pkg_Self_Learning;
import java.io.*;
public class BRReadLines {
	public static void main(String args[])
	throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("enter lines of text");
		System.out.println("enter Stop to stop");
		do {
			str=br.readLine();
			System.out.println(str);
		}while(!str.equals("stop"));
	}

	
}
