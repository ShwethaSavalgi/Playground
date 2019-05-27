import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int n,i,ori,rem,res=0;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      ori=n;
      
      while(ori!=0)
      {
        rem=ori%10;
        res=res+rem*rem*rem;
        ori=ori/10;
        
      }
         if(res==n)
           System.out.println("Armstrong Number");
           else
              System.out.println("Not a Armstrong Number");
	}
}