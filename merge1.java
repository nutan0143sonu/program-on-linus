import java.util.Scanner;
/*
  Enter the size of array
7
Enter the element of array
2
4
5
6
9
2
1
now the output of merge sort are   //the problem is ,i took i=j=0
0  0  2  4  5  6  9 
output is incorrect.
the solution of this problem is 
i=j=1

*/
class merge1
{
   void merge(int a[],int p,int q,int r)//p=initial index, q=middle inde, r=end index
   {
    int i,j,k;
	int L[]=new int[50];//L[1....n1+1]&R[1.....n2+1 be new array
	int R[]=new int[50];
      int n1=q-p+1;
	  int n2=r-q;
	  for(i=1;i<=n1;i++)
	  {
	      L[i]=a[p+i-1];
	  }
	  for(j=1;j<=n2;j++)
	  {
	      R[j]=a[q+j];
	  }
	  L[n1+1]=999999999;
	  R[n2+1]=999999999;
	  i=j=1;
	  for(k=p;k<=r;k++)
	  {
	  if(L[i]<=R[j])
	  {
	      a[k]=L[i];
		  i++;
	  }
	  
	  else
	  {
	     a[k]=R[j];
		 j++;
	  }
	  }
   }
    public static void main(String ar[])
	{
	     Scanner ob=new Scanner(System.in);
		 merge1 o=new merge1();
		 int a[]=new int[100];
		 int n,s;
		 System.out.println("Enter the size of array");
		 n=ob.nextInt();
		 System.out.println("Enter the element of array");
		 for(s=1;s<=n;s++)
		 {
		     a[s]=ob.nextInt();
		 }
		 o.merge(a,1,(n+1)/2,n);
		 System.out.println("now the output of merge sort are");
		 for(s=1;s<=n;s++)
		 {
		     System.out.print(a[s]+"  ");
		 }
	}
}