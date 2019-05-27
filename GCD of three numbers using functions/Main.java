import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code hereint 
      int n1,n2,n3,i,gcd=0;
      Scanner in = new Scanner(System.in);
      n1=in.nextInt();
       n2=in.nextInt();
       n3=in.nextInt();
      for(i=1;i<=n1 && i<=n2 && i<=n3 ;i++)
      {
        if(n1%i ==0 && n2%i==0 && n3%i==0)
        gcd=i;
             
      }
      System.out.println(gcd);
	}
}