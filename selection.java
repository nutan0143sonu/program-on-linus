import java.util.Scanner;
class selection
{
     public static void main(String ar[])
	 {
	     Scanner ob=new Scanner(System.in);
	     int a[]=new int[100];
		 int i,j,k,min;
		 System.out.println("enter the size of array");
		 int n=ob.nextInt();
		 System.out.println("Enter the element of array");
		 for(i=1;i<=n;i++)
		 {
		      a[i]=ob.nextInt();
		 }
		 for(i=1;i<n;i++)
		 {
			 for(j=i+1;j<=n;j++)
			 {
			     if(a[i]>a[j])
				 {
				    int t=a[i];
				 a[i]=a[j];
				 a[j]=t; 
				 }
				
			 }
			  
		 }
		 System.out.println("Now the sorted array is");
		 for(i=1;i<=n;i++)
		 {
		     System.out.print(a[i]+"   ");
		 }
	 }
}