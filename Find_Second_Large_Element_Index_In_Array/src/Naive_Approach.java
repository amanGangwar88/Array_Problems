import java.util.Scanner;
// In this approach we are doing two traversal 
// first one is max_index() and second one second_max_index()
public class Naive_Approach {
	static void second_max_index(int array[]) {
		int max_index = max_index(array);
		int second_max_index =-1;
		for(int i=0; i<array.length; i++) {
			if(array[i] != array[max_index]) {
				if(second_max_index == -1)
					second_max_index = i;
				else if(array[i] > array[second_max_index]){
					second_max_index = i;
				}
			}
		}
		System.out.println( second_max_index);
	}
    static int max_index(int array[]) {
    	int max_index=0;
    	for(int i=1; i<array.length; i++ ) {
    		if(array[i] > array[max_index])
    			max_index = i;
    	}
    	return max_index;
    }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Size of array :");
		 int array[] = new int[sc.nextInt()];
		 System.out.println("enter the array elements :");
		 for(int i=0; i< array.length; i++) {
			 array[i] = sc.nextInt();
		 }
		 second_max_index(array);
	}

}
