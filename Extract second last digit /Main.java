import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n,n1,n2;
      Scanner in =new Scanner(System.in);
      n=in.nextInt();
      n1=n%100;
      n2=n1/10;
      System.out.println(n2);
	}
}