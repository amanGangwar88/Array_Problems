import java.util.Scanner;

public class Eficient_Approach {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[] =new int[n];
		 for(int i=0; i<n ;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int lmax[]=new int[n];
		 lmax[0] =arr[0];
		 for(int i=1;i<n;i++) {
			 lmax[i] = Math.max(arr[i], lmax[i-1]);
		 }
		 int rmax[]=new int[n];
		 rmax[n-1]=arr[n-1];
		 for(int i=n-2;i>=0; i--) {
			 rmax[i] = Math.max(arr[i], rmax[i+1]);
		 }
		 int res=0;
		 for(int i=0; i<n;i++) {
			 res = res +(Math.min(lmax[i], rmax[i])-arr[i]);
		 }
		 System.out.println(res);
	}

}
