import java.util.Scanner;
class insert1
{
     public static void main(String ra[])
   {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=ob.nextInt();
    int k=0;
   int loc,i,element;
int a[]=new int[20];
   System.out.println("enter the element of array");
    for(i=0;i<=n;i++)
     { a[i]=ob.nextInt();
     }
   System.out.println("enter the location for entering the element");
  loc=ob.nextInt();
  System.out.println("enter the element ");
element=ob.nextInt();
     for(i=n;i>loc;i--)
      {
        a[i+1]=a[i];
      }
   a[loc]=element;
    System.out.println("Now the array is");
  for(i=0;i<=n+1;i++)
{
      System.out.println(a[i]);
}
}
}

