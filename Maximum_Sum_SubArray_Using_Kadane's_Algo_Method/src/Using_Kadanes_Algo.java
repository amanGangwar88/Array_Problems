import java.util.Scanner;

public class Using_Kadanes_Algo {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n ;i++) {
			 arr[i]=sc.nextInt();		 
		}
		 int res = arr[0], Max_ending=arr[0];
		 for(int i=1; i<n; i++) {
			 Max_ending =Math.max(Max_ending+arr[i], arr[i]);
			 res=Math.max(res, Max_ending);
		 }
		 System.out.println(res);
	}

}
