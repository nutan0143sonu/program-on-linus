import java.util.Scanner;
class binary
{
    public static void main(String ar[])
	{
	    Scanner ob=new Scanner(System.in);
	    int a[]=new int[50];
		int i;
		System.out.println("enter the the size of array");
		int n=ob.nextInt();
		System.out.println("Enter the element of array");
		for(i=1;i<=n;i++)
		{
		    a[i]=ob.nextInt();
		}
		int beg=1,end=n,loc=0,item,mid;
		System.out.println("Enter the item to be search");
		item=ob.nextInt();
		System.out.println("the array is ");
		for(i=1;i<=n;i++)
		System.out.println("  "+a[i]);
		while(beg<=end)
		{
		     mid=(beg+end)/2;
			 if(item==a[mid])
			 {
			    loc=mid;
				break;
			 }
			 if(item<a[mid])
			 {
			    end=mid-1;
			 }
			 else
			 {
			  beg=mid+1;
			 }
		}
		if(loc!=0)
		{
		    System.out.println("the item "+item+"on location "+loc);
		}
		else{
		  System.out.println("Item is not found in the array");
		}
	}
}