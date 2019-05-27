import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n,i,exp,res=1;
      Scanner in = new Scanner(System.in);
      n=in.nextInt();
      exp=in.nextInt();
     while(exp!=0)
      {
        res=res*n;
       
       --exp;
      }
      System.out.println(res);
	}
}