import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n,i,j;
      Scanner in = new Scanner(System.in);
      n=in.nextInt();
      for(i=n;i>=1;i--)
      {
        for(j=i;j>=1;j--)
        {
          System.out.print(j);
        }
        System.out.print("\n");
      }
	}
}