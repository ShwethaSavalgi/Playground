import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
   int n,i,sum1=0,sum2=0;
    int a[]=new int[100];
    Scanner in =new Scanner(System.in);
    n=in.nextInt();
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    for(i=0;i<=2;i++)
    {
      sum1=sum1+a[i];
    }
    for(i=3;i<=5;i++)
    {
      sum2=sum2+a[i];
    }
    if(sum1==sum2)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
                  
  }
}