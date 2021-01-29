package amangangwar;
//REmove Duplicates from Sorted Array
import java.util.Scanner;

public class Remove_Duplicate {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter Size of Array :");
		 int array[] = new int[sc.nextInt()];
		 System.out.print ("Enter Array Elements :");
		 for(int i=0; i<array.length; i++) {
			 array[i] = sc.nextInt();
		 }
		 int temp [] = new int[array.length];
		 temp[0] = array[0];
		 int size=1;
		 for(int i=1; i<array.length; i++) {
				 if(array[i] != temp[size-1]) {
					  temp[size] = array[i];
					  size ++;
				 }
			 }
		 for(int i=0; i<size;i++) {
			 array[i] = temp[i];
		 }
		 for(int i=0; i<size; i++) {
			 System.out.println(array[i]);
		 }
		 }
}
