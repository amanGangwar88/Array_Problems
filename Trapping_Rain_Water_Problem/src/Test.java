import java.util.Scanner;

public class Test {
          static void fun(int arr[], int n) {
        	  int res=0;
        	  for(int i=1; i<n-1; i++) {
        		  int lmax=arr[i];
        		  int rmax=arr[i];
        		  for(int j=0; j<i; j++) {
        			  lmax=Math.max(lmax, arr[j]);
        		  }
        		  for(int j=i+1; j<n; j++) {
        			  rmax=Math.max(rmax, arr[j]);
        		  }
        		int  Minimum = Math.min(lmax, rmax);
        		res = res + (Minimum - arr[i]);
        	  }
        	  System.out.println(res);
          }
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]= new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]= sc.nextInt();
		 }
		  fun(arr,n);
	}

}
