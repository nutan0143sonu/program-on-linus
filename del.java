import java.util.Scanner;
class del
{
     public static void main(String ar[])
	 {
	      int loc=0,item,n,i;
		  int a[]=new int[50];
		  Scanner ob=new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  n=ob.nextInt();
		  System.out.println("Enter the element of array");
		  for(i=0;i<n;i++)
		  {
		      a[i]=ob.nextInt();
			  
		  }
		  System.out.println("enter the item for deleting");
		  item=ob.nextInt();
		  for(i=0;i<n;i++)
		  {
		      if(a[i]==item)
			  {
			     loc=i;
				 System.out.println("item is founf on location "+loc);
				 break;
			  }
			  
		  }
		  if(loc!=0)
		  {
		       for(i=loc;i<n;i++)
	             {
	                a[i]=a[i+1];
		  
	             }
	       n=n-1;
		   System.out.println("now the array is after deletion is");
		    for(i=0;i<n;i++)
			{
			    System.out.println(a[i]);
			}
		  }
		 else
			  {
			    System.out.println("item is not found");
			  } 
	 }
}