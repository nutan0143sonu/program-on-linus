import java.util.Scanner;
/*
   error: not a statement
                  int 1,key,j; this is the first problem came
				  *i remove this by replacing 1 to i-1.
				  
	*the second problem are following			  
Enter the size of array
6
enter the element of array
9
4
0
2
6
3
now the sorted array are
0   0   0   2   3   3          Now the output is not correct because 
                               while(i>0 && a[i]>key)
			                    {
			                       a[i+1]=a[j];//instead of a[i] ,there is a[j]
				                    i=i-1;
			                      }  .

and the solution of this 
a[i+1]=a[i];

Now the output is correct.			   
*/
class insertion1
{
     public static void main(String ar[])
	 {
	      Scanner ob=new Scanner(System.in);
		  int i,key,j;
		  int a[]=new int[50];
		  System.out.println("Enter the size of array");
		  int n=ob.nextInt();
		  System.out.println("enter the element of array");
		  for(i=1;i<=n;i++)
		  {
		       a[i]=ob.nextInt();
		  }
		  for(j=2;j<=n;j++)
		  {
		      key=a[j];
			  i=j-1;
			  while(i>0 && a[i]>key)
			  {
			     //a[i+1]=a[i];
				 int temp=a[i];
				 a[i]=a[i+1];
				 a[i+1]=temp;
				 i=i-1;
			  }
			  a[i+1]=key;
		  }
		  System.out.println("now the sorted array are");
		  for(i=1;i<=n;i++)
		  {
		     System.out.print(a[i]+"   ");
		  }
	 }
}