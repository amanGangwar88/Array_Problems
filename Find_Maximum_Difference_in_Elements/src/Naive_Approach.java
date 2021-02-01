import java.util.Scanner;
// Find Maximum Difference in element Arr[j]-Arr[i] where j>i
public class Naive_Approach {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Size of array :");
		 int n =sc.nextInt();
		 int arr []=new int[n];
		 System.out.print("Eneter The Element of an array :");
		 for(int i=0; i<n; i++) {
			 arr[i]=sc.nextInt();
		 }
		 int max=0;
		 int res=0;
		 for(int i=0; i<n ; i++) {
			 for(int j=i+1; j<n; j++) {
				 res=arr[j]-arr[i];
				 if(res>max) {
					 max=res;
				 }
			 }
		 }
		 System.out.println(max);
	}

}
