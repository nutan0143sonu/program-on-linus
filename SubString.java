import java.util.Scanner;
import java.util.*;
class Girl
{
     List<String>findValues(String TestString,int len)
	  {
	         List<String> list=new ArrayList<String>(); 
			 char data[]=new char[len];
	           
	          for(int i=0;i<len;i++)
			  {
			       data[i]=TestString.charAt(i);
			  }
			  for(int i=0;i<len-1;i++)
			  {
              int occur=0;
			        for(int j=i+1;j<len;j++)
					{
					      if(data[i]==data[j])
						  {
						        
								 String newString=new String(data);
						          list.add(newString);
								 System.out.println(newString);
                    occur=occur+1;
                 break;
                 
								 
						  }
              
					}
          if(occur==1)
          {
              break;
          }
			  }
			  return list;
	  }
       public static void main(String ar[])
	   {
	         Scanner scan=new Scanner(System.in);
			 System.out.println("enter the TestString");
			 String words=scan.next();
			 int length=words.length();
			 System.out.println("Enter the Length of sub String");
			 int sublength=scan.nextInt();
			 Girl speak=new Girl();
			 int p;
			 for(p=0;p<=length-sublength;p++)
			 {
			       String s1=words.substring(p,sublength+p);
			       speak.findValues(s1,sublength);
			 }
			 
			 
			 
	   }
}