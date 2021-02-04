import java.util.Scanner;

public class Naive_Approach {
 //Majority element is an element that appears more than n/2 times in an array of size n.
  
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0; i<n; i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 for(int i=0; i<n;i++) {
			 int count=1;
			 for(int j=i+1;j<n;j++) {
				 if(arr[i]==arr[j]) {
					 count++;
				 }
			 }
			 if(count>n/2) {
				 System.out.println(i);
			 }
		 }	  
	}
}
