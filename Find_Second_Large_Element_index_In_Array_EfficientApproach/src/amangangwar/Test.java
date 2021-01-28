package amangangwar;

import java.util.Scanner;

public class Test {
	static void SecondLargeIndex(int a[]) {
		int result = -1, largest = 0;
		for(int i=1; i<a.length; i++) {
			if(a[i]>a[largest]) {
				result= largest;
				largest= i;
			}else if(a[i] <a[largest]) {
				if(a[i]>a[result])
					result = i;
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Eneter Size Of Array :");
		 int a[]= new int[sc.nextInt()];
		 System.out.println("Eneter Array Elements :");
		 for(int i=0; i<a.length; i++) {
			 a[i]=sc.nextInt();
		 }
		 SecondLargeIndex(a);
	}

}
