import java.util.Scanner;

public class Use_Reversal_Algo {
      static void rotate(int array[], int low, int high) {
    	  while(low < high) {
    		  int temp = array[high];
    		  array[high]= array[low];
    		  array[low] =temp;
    		  low++;
    		  high--;
    	  }
      }
      static void printarray(int array[] ,int n) {
    	  for(int i=0; i<n; i++) {
    		  System.out.println(array[i]);
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Size Of Array :");
		 int array[] = new int[sc.nextInt()];
		 int n =array.length;
		 System.out.println("Eneter Elements in Array :");
		 for(int i=0; i< n; i++) {
			 array[i] = sc.nextInt();
		 }
		 System.out.print("enter the value of d :");
		 int d = sc.nextInt();
		 rotate(array, 0, d-1);
		 rotate(array, d, n-1);
		 rotate(array, 0, n-1);
		 printarray(array,n);
	}

}
