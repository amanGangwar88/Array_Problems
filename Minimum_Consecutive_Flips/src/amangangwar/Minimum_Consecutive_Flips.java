package amangangwar;

import java.util.Scanner;

public class Minimum_Consecutive_Flips {
     
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      for(int i=0;i<n;i++) {
	    	  arr[i]=sc.nextInt();
	      }
	      for(int i=1;i<n;i++) {
	    	  if(arr[i]!=arr[i-1]) {
	    		  if(arr[i]!=arr[0]) {
	    		     System.out.println("From "+i+" To");
	    		  }
	    		  else {
	    			  System.out.println(i-1);
	    		  }
	    	  }
	      }
	      if(arr[n - 1] != arr[0])
	            System.out.println(n-1);
	    }

	}
