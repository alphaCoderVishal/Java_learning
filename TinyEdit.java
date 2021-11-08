package Pkg_Self_Learning;
import java.io.*;
public class TinyEdit {
	public static void main(String args[]) 
	throws IOException
	{
		BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
		String str[]=new String[100];
		System.out.println("Enter lines of text and if you want to stop just type stop.");
		int i;
		for(i=0;i<str.length;i++)
		{
			str[i]=br.readLine();
		   if(str[i].equals("stop"))
           break;
		}
		System.out.println("HERE IS YOUR FILE");
		//DISPLAY
		for(i=0;i<str.length;i++)
		{
			if(str[i].equals("stop"))
				break;
			else
			System.out.println(str[i]);
			
		}
	}
	
	
		
	}


