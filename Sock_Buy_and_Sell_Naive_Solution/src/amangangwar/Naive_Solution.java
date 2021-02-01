package amangangwar;

import java.util.Scanner;

public class Naive_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n ;i++) {
			arr[i]=sc.nextInt();
		}
		int i=1;
		int price=0;
		while(i<n) {
			if(arr[i-1]<arr[i]) {
				price = price +(arr[i]-arr[i-1]);
			}
			i++;
		}
       System.out.println(price);
	}

}
