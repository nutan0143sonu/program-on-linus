import java.util.Scanner;
//import java.util.*;
//import java.text.CharacterIterator;
public class Search
{
    public static void main(String ar[])
	{
	     int i,j,len;
	      Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the String");
		    String Data=scan.next();
			len=Data.length();
			System.out.println("Length is \t"+len);
			char d[]=new char[len];//=new String[len];
           int occur;
		   for(i=0;i<len;i++)
		   {
		   d[i]=Data.charAt(i);
		   }
		  for(i=0;i<len;i++)
		   {
		   System.out.print(d[i]);
		   }
		  for(i=0;i<=len-5;i++)
		  {
		       occur=1;
		       for(j=i+1;j<=i+4;j++)
			   {
			       if(d[i]==d[j])
				   {
				        occur=occur+1;
				   }
                				   
			   }
			   if(occur!=1)
			   {
			   System.out.println("Letter "+d[i]+" is occur "+occur);
			   }
		  }
	}
}