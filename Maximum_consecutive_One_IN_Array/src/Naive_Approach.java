import java.util.Scanner;

public class Naive_Approach {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Size");
	 int n=sc.nextInt();
	 int arr[]= new int[n];
	 System.out.println("Element");
	 for(int i=0; i <n ;i++) {
		 arr[i]=sc.nextInt();
     }
	 int count=0, max=0;
	for(int i=0; i<n; i++) {
		if(arr[i]==1) {
			count++;
		}else {
			count=0;
		}
		if(count>max) {
			max=count;
		}
	}
	  System.out.println(max);
	}
}
