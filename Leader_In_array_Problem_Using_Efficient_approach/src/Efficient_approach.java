import java.util.Scanner;

public class Efficient_approach {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Size of array :");
		 int n =sc.nextInt();
		 int arr []=new int[n];
		 System.out.print("Eneter The Element of an array :");
		 for(int i=0; i<n; i++) {
			 arr[i]=sc.nextInt();
		 }
		  int leader = arr[n-1];
		  System.out.println(arr[n-1]);
		  for(int i=n-2; i>=0; i-- ) {
			  if(arr[i] > leader) {
				  leader = arr[i];
				  System.out.println(arr[i]);
			  }
		  }
	}

}
