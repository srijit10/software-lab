package folder;
import java.util.Scanner;
public class bsearch {

	public static void main(String[] args) {
		System.out.println("enter the size of the array\n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array\n");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched\n");
        int t=sc.nextInt();
        sc.close();
        int low=0,high=n-1,mid;
        while(low<=high)
        {
        	mid=(low+high)/2;
        	if(arr[mid]==t)
        		{System.out.println("Element is found at position number "+(mid+1)+"\n");
        		 break;
        		}
        	else if(arr[mid]<t)
        		low=mid+1;
        	else
        		high=mid-1;
        }
        if(low>high)
        	System.out.println("Element is not found\n");
	}

}
