import java.util.Scanner;
/*
*/
public class quick1
{
    
	int partition(int a[],int low ,int high)
	{
	     int x=a[high];
		 int i=low-1;
		 
		for(int j=low;j<high;j++)
		{
		    if(a[j]<=x)
			{
			    i=i+1;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		      
		}
		 int t=a[i+1];
		a[i+1]=a[high];
		a[high]=t;
		return i+1;
	}
	void sort(int a[],int low,int high)
	{
	    if(low<high)
		{
		   int p=partition(a,low,high);
		   sort(a,low,p-1);
		   sort(a,p+1,high);
		   
		}
	}
	public static void main(String arr[])
	{
	        Scanner ob=new Scanner(System.in);
	int a[]=new int[100];
	int i,j,k,n;

	System.out.println("Enter the size of array");
	n=ob.nextInt();
	System.out.println("Enter the element  of array");
	for(i=1;i<=n;i++)
	{
	    a[i]=ob.nextInt();
	}
         quick1 o=new quick1();
         o.sort(a,1,n);
         
         System.out.println("now the sorted array are");
         for( k=1;k<=n;k++)
{
           System.out.print(a[k]+" ");
}		 
	}
}