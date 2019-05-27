import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int largest,i,n;
      Scanner in= new Scanner(System.in);
      n=in.nextInt();
      int array[]=new int[100];
      for(i=0;i<n;i++)
      {
        array[i]=in.nextInt();
      }
      
      largest = array[0];
         for (i = 1; i < n; i++) 
        {
		if (largest < array[i])
			largest = array[i];
	}
System.out.println(largest);
    }
}