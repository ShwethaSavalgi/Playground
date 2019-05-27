import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int temp,n,digit,sum=0;
      Scanner in = new Scanner(System.in);
      n=in.nextInt();
      temp=n;
      while(n>0)
      {
        digit=n%10;
        sum=sum+digit;
        n=n/10;
      }
      System.out.println(sum);
	





	
	}
}