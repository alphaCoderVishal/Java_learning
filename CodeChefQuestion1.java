package Pkg_Self_Learning;

import java.util.*;

class IncreaseFast{
	String str;
	Scanner sc=new Scanner(System.in);
	String getString(){
   
    str=sc.next();
    if(str.equals(str.toLowerCase())) {
    	//System.out.println("Thank you for giving lowercase as input");
    	return str;
    }
    else {
    	System.out.println("sorry you have not given lowercase characters in string but our system will convert in lowercase for you");
    	return str.toLowerCase();
    }
    
	}
	String sortString(String str) {
		
		char[]s=str.toCharArray();//converting string into char array
		
		int i=0,j,key=0;
		 
		for(j=1;j<str.length();j++) {
			if(s[j]>=s[key])
			{
				key++;
				
			}
			
			else {
				char temp=s[j];
				i=key;
				
				while(i>=0 && s[i]>temp ) {
					s[i+1]=s[i];//shifting the greater content by 1 position
					i--;
				}
				s[i+1]=temp;
				key++;
			}
		}
		
		str=String.valueOf(s);
		
		
		return str;
	}
	
   
}
public class CodeChefQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IncreaseFast sort=new IncreaseFast();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the number of string to be sorted");
        int num=sc1.nextInt();
      
        System.out.println("Enter the "+num+"  string to be sorted");

        int ind;
        String[] str=new String[num];
        System.out.println("Enter the string with lowercase to be sorted in lexicographically sorted order");
       for(ind=0;ind<num;ind++) {
       
       str[ind]=sort.getString();
      // System.out.println(str[ind]);
       }
       
       for(ind=0;ind<num;ind++) {
       str[ind]= sort.sortString(str[ind]);
      System.out.println(str[ind]);
      sc1.close();
       }
	}

}
