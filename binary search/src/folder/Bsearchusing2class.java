package folder;
import java.util.Scanner;

public class Bsearchusing2class extends Search {
     public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the no of elements");
    	 int n=sc.nextInt();
    	 int arr[]=new int[n];
    	 System.out.println("Enter the elements in the array");
    	 for(int i=0;i<n;i++)
    	 {
    		 arr[i]=sc.nextInt();
    	 }
    	 System.out.println("Enter the element to be searched");
    	 int t=sc.nextInt();
    	 Search s=new Search();
    	 s.binarysearch(arr,0,n-1,t);
    	 sc.close(); 
     }
}
