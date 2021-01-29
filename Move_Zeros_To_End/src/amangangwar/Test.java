package amangangwar;
//Naive Approach
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Size Of Array :");
		 int array[] = new int[sc.nextInt()];
		 System.out.println("Eneter Elements in Array :");
		 for(int i=0; i< array.length; i++) {
			 array[i] = sc.nextInt();
		 }
		 for(int i=0; i<array.length; i++) {
			 if(array[i]==0) {
				 for(int j=i+1; j<array.length; j++) {
					 if(array[j] != 0) {
						 int temp;
						 temp = array[j];
						 array[j] =array[i];
						 array[i]= temp;
					 }
				 }
			 }
		 }
	}

}
