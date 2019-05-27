import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n,n1,n2,sum;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      n1=n/10;
      n2=n%10;
      sum=n1+n2;
      System.out.println(sum);
	}
}