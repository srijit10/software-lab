package folder;

public class Search{
	public void binarysearch(int arr[],int low,int high,int t)
	{
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==t)
			{
				System.out.println("Element is found at position "+(mid+1));
				break;
			}
			else if(arr[mid]<t)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		if(low>high)
			System.out.println("Element is not found");
	}
}
