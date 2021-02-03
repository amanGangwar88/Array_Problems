import java.util.Scanner;

public class Efficient_Approach {
     static void evenodd(int arr[], int n) {
    	 int res=1;
    	 int len=1;
    	 for(int i=1;i<n ;i++) {
    		 if((arr[i]%2==0 && arr[i-1]%2!=0)|| (arr[i]%2!=0 &&arr[i-1]%2==0)) {
    			len++;
    			res=Math.max(res, len);
    		 }
    		 else {
    			 len=1;
    		 }
    	 }
    	 System.out.println(res);
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Size");
		 int n=sc.nextInt();
		 int arr[]= new int[n];
		 System.out.println("Element");
		 for(int i=0; i <n ;i++) {
			 arr[i]=sc.nextInt();
	     }
       evenodd(arr,n);
	}

}
