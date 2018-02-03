import java.util.Scanner;
class deletionA
{
   public static void main(String ar[])
   {
       int k,i,n;
	   Scanner ob=new Scanner(System.in);
	   System.out.println("Enter the size of array");
	   n=ob.nextInt();
	   int a[]=new int[50];
	   System.out.println("Enter the position");
	   k=ob.nextInt();
	   System.out.println("enter the element of array");
	   for(i=0;i<n;i++)
	   {
	     a[i]=ob.nextInt();
	   }
	   for(i=k;i<n;i++)
	   {
	       a[i]=a[i+1];
		   //n=n-1;
	   }
	   n=n-1;
	   System.out.println("now the array is");
	   for(i=0;i<n;i++)
	   {
	       System.out.println(a[i]);
	   }
   }
}