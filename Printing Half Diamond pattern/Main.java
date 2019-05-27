import java.util.Scanner;
class Main {
	public static void main (String[] args){
      
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int p_height=in.nextInt();
      int min_stars=1;

int p_space=p_height-1;
int i,j,k;

for(i=0;i<p_height;i++)
{
for(j=p_space;j>i;j--)
{
 System.out.print(" ");
}
for(k=0;k<min_stars;k++)
{
System.out.print("*");
}
min_stars+=2;
System.out.print("\n");
}
	}
}