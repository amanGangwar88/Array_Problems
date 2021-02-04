import java.util.Scanner;

public class Naive_Approach {
    static void SumCircularSubArray(int arr[], int n) {
    	int res=arr[0];
    	for(int i=0;i<n;i++) {
    		int curr_sum=arr[i];
    		int curr_max=arr[i];
    		for(int j=1;j<n;j++) {
    			int index =(i+j)%n;
    			curr_sum=curr_sum+arr[index];
    			curr_max=Math.max(curr_max, curr_sum);
    		}
    		res = Math.max(res, curr_max);
    	}
    	System.out.println(res);
    }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 SumCircularSubArray(arr,n);
	}

}
