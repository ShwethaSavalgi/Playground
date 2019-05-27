import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int i,n,fact=1;
      Scanner in = new Scanner(System.in);
      n=in.nextInt();
      for(i=1;i<=n;i++)
      {
		 fact=fact*i;
      }
      System.out.println(fact);
	}
}