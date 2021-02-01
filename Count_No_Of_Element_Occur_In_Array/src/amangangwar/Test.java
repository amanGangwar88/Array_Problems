package amangangwar;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of array :");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter the elements in array :");
	 for(int i=0;i <n; i++) {
		 arr[i]= sc.nextInt();
	 }
	 int i=1, count=1;
	 while(i<n) {
		 while(i<n && arr[i-1]==arr[i]) {
			 count++;
			 i++;
		 }
		 System.out.println(arr[i-1]+" "+count);
		 i++;
		 count =1 ;
	 }
	 if(arr[n-1] != arr[n-2]) {
		 System.out.println(arr[n-1]+" "+1);
	 }
	}

}
