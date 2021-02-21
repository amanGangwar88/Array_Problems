  
import java.util.*;
public class Nth_Full_prime_no {
	public static boolean checkDigits(int n) 
    {  
        while (n > 0) { 
            int dig = n % 10; 
   
            if (dig != 2 && dig != 3 &&  
                dig != 5 && dig != 7) 
                return false; 
  
            n /= 10; 
        } 
  
        return true; 
    }  
    public static boolean prime(int n) 
    { 
        if (n == 1) 
            return false; 
   
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) 
                return false; 
        } 
  
        return true; 
    }  
    public static boolean isFullPrime(int n) 
    {  
        return (checkDigits(n) && prime(n)); 
    } 
    
  public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter nth element");
        int n = sc.nextInt(); 
        int count=0;
        int num=2;
        int i,limit=num+1;
         while(count<n) {
        	 for(i=num;i<limit;i++) {
        		 if (isFullPrime(num)) 
                   { 
        			 count++;
        			  if(count==n) {
        				  System.out.println(num);
        				  break;
        			  }
                   }
        		 limit++;
        		 num++;
        	 }
         }
    } 
  }