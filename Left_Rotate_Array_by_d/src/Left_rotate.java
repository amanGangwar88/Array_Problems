import java.util.Scanner;

public class Left_rotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Size Of Array :");
		 int array[] = new int[sc.nextInt()];
		 int n =array.length;
		 System.out.println("Eneter Elements in Array :");
		 for(int i=0; i< n; i++) {
			 array[i] = sc.nextInt();
		 }
		 System.out.print("enter the value of d :");
		 int d = sc.nextInt();
		 int temp[] = new int[d]; 
		 for(int i=0; i<d; i++) {	  
			 temp[i] = array[i];
		 }
		 for(int i=d;i<n; i++) {
			 array[i-d]=array[i]; 
		 }
		 for(int i=0; i<d; i++) {
			 array[n-d+i] = temp[i];
		 }
		 for(int i=0;i<n;i++) {
			 System.out.println(array[i]);
		 }
	}

}
