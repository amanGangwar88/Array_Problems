import java.util.Scanner;

public class LeftRotate {
	   static void Left_Rotate(int arr[], int d) {
		   for(int i=0 ; i<d ; i++) {
        	   left_rotate_by_one(arr);
           }
		   for(int i=0; i<arr.length; i++) {
			   System.out.println(arr[i]);
		   }
	   }
        static void left_rotate_by_one(int arr[]) {
        	int temp= arr[0];
        	for(int i=1; i<arr.length; i++) {
        		arr[i-1]=arr[i];
        	}
        	arr[arr.length-1] = temp; 
        }
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the size of array :");
		 int arr[] = new int[sc.nextInt()];
		 System.out.println("eneter The element of the array :");
		 for (int i=0; i<arr.length ; i++) {
			 arr[i] = sc.nextInt();
		 }
		 System.out.print("enter the value of d :");
		 int d = sc.nextInt();
          
		 Left_Rotate(arr, d);
	}

}
