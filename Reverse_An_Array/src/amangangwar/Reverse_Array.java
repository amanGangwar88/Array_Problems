package amangangwar;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter Size of Array :");
		 int array[] = new int[sc.nextInt()];
		 System.out.print ("Enter Array Elements :");
		 for(int i=0; i<array.length; i++) {
			 array[i] = sc.nextInt();
			 System.out.println(" ");
		 }
		 int i=0, j =array.length-1;
		 while(i<j) {
			 int temp;
			 temp=array[j];
			 array[j]=array[i];
			 array[i]=temp;
			 i++;
			 j--;
		 }
		 for(int k=0; k<array.length; k++) {
			 
			 System.out.println(array[k]);
		 }
	}

}
