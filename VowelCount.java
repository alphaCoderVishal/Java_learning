package Pkg_Self_Learning;
import java.io.*;
class scanner1 {
	public String scnWord() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str;
	 
	
	  str=br.readLine();
	  
	
	//System.out.println("hello");
	return str;
	}
}
class cntVowel{
	int countVowel(String  str) {
		int i=0;
		int total=0;
		str=str.toLowerCase();
		char[] ch=new char[100];
		ch=str.toCharArray();
		for (i=0;i<str.length();i++)
		{
			switch(ch[i])
			{
			  case 'a':
			  {
			  total++;
			  break;
			  }
			  case 'e':
			  {
				  total++;
				  break;
			  }
			  case 'i':
			  {
				  total++;
				  break;
			  }
			  case 'o':
			  {
				  total++;
				  break;
			  }
			  case 'u':
			  {
				  total++;
				  break;
			  }
			}
		}
		return total;
	}
}
public class VowelCount {
	public static void main(String args[])throws IOException
	{
      String str;
      //System.out.println("hello");
      
      scanner1 scn=new scanner1();
      //System.out.println("hello");
     str= scn.scnWord();
     //System.out.println("hello");
      cntVowel cv=new cntVowel();
      System.out.println(cv.countVowel(str));
}
}


