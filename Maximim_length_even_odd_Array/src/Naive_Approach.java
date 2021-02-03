import java.util.Scanner;

public class Naive_Approach {
    static void evenodd(int arr[],int n) {
    	int res=1;
    	for(int i=0;i<n;i++) {
    		int length=1;
    		for(int j=i+1; j<n;j++) {
    			if((arr[j]%2==0 && arr[j-1]%2 !=0) || (arr[j]%2!=0 && arr[j-1]%2==0)) {
    				length++;
    			}else {
    				break;
    			}
    		}
    		res = Math.max(res, length);
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
