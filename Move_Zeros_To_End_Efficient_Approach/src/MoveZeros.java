import java.util.Scanner;
//Efficient Approach,Time Complexity O(n). 
public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Size Of Array :");
		 int array[] = new int[sc.nextInt()];
		 System.out.println("Eneter Elements in Array :");
		 for(int i=0; i< array.length; i++) {
			 array[i] = sc.nextInt();
		 }
		 int count =0 ;
		 for(int i=0; i<array.length; i++) {
			 if(array[i] != 0) {
				    int temp = array[i];
				    array[i]= array[count];
				    array[count] = temp;
				    count++;
			 }
		 }
		 for(int i=0; i<array.length; i++) {
			 System.out.println(array[i]);
		 }
	}

}
 