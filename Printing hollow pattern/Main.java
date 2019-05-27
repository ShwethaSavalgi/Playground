import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      int n,i,j;
      Scanner in = new Scanner(System.in);
      n=in.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          if((j==1 || j==n) ||( i==1 ||i==n))
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.print("\n");
      }
       
	}
}