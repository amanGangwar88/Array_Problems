import java.util.Scanner;

public class Mejority_Element {
   static void mejority_element(int arr[], int n) {
	  // Phase ONE.
	   int res=0, count=1;
	   for(int i=0; i<n;i++) {
		   if(arr[res]==arr[i])
			   count++;
		   else
			   count--;
		   if(count==0) {
			   res=i;
			   count=1;
		   }
	   }
	   //Phase SECOND.
	   count=0;
	   for(int i=0; i<n; i++) {
		  
		   if(arr[res]==arr[i])
			   count++;
	   }
	   if(count<=n/2)
		   res=-1;
	   	   System.out.println(res);
   }
   
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      mejority_element(arr,n);
	}

}
