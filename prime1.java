class prime1
{
   public static void main(String args[])
   {
       int n,i,flag=0;
	   int prime=300;
	   System.out.println("all prime numbers between 1 and 300");
	   for(n=1;n<=prime;n++)
	   {
	   flag=0;
	   for(i=2;i<n/2;i++)
	   {
	       if(n%i==0)
		   {
			  flag=1;
			  break;
		   }
		   
	   }
	   if(flag==0)
	   {
	       System.out.println(n+" number is prime");
	   }
	   }
   }
}