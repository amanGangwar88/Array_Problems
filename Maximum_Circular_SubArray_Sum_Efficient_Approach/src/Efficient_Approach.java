import java.util.Scanner;

public class Efficient_Approach {
      static void min(int arr[], int n) {
    	   int sum1 =max_normal_subarray(arr,n); 
    	 int sum2=max_circular_subarray(arr,n);
    	 System.out.println(Math.max(sum1, sum2));
    	  }
      static int max_normal_subarray(int arr[], int n) {
    	  int res=arr[0], maxval=arr[0];
    	  for(int i=1;i<n; i++) {
    		  maxval=Math.max(maxval+arr[i], arr[i]);
    		  res=Math.max(res, maxval);
    	  }
    	  return res;
      }
      static int max_circular_subarray(int arr[], int n) {
    	  int res=arr[0]; int minval=arr[0];
    	  for(int i=1;i<n;i++) {
    		    minval = Math.min(minval+arr[i], arr[i]);
    		    res = Math.min(res, minval);
    		  }
    	  int sum=0;
    	   for(int i=0;i<n;i++) {
    		   sum=sum+arr[i];
    	   }
    	   int sum2 = sum-res;
    	   return sum2;
      }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 min(arr,n);
	}

}
