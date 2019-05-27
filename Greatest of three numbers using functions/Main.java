import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n1,n2,n3;
      Scanner in =new Scanner(System.in);
      n1=in.nextInt();
       n2=in.nextInt();
       n3=in.nextInt();
    if(n1>n2 && n1>n3)
    {
     System.out.println(n1);
    }
      else if(n2>n3 && n2>n1)
      {
        System.out.println(n2);
      }
      else if(n3>n1 && n3>n2)
      {
        System.out.println(n3);
      }
    
	}
}