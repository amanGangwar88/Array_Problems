import java.util.Scanner;
public class Efficient_Approach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Size of array :");
		 int n =sc.nextInt();
		 int arr []=new int[n];
		 System.out.print("Enter The Element of an array :");
		 for(int i=0; i<n; i++) {
			 arr[i]=sc.nextInt();
		 }
		 int maxval = arr[1]-arr[0];
		 int minval = arr[0];
		 for(int j=0; j<n; j++) {
			 maxval= Math.max(maxval, arr[j]-minval);
			 minval = Math.min(minval, arr[j]);
		 }
       System.out.println(maxval);
	}

}
