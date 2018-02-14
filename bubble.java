import java.util.Scanner;
class bubble
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
		    for(j=1;j<=n-i;j++)
			{
			   if(a[j]>a[j+1])
			   {
			      int t=a[j];
				  a[j]=a[j+1];
				  a[j+1]=t;
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