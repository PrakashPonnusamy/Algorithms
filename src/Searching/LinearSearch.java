package Searching;

public class LinearSearch {
	public static int findElement(int[] arr, int key)
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args)
{
	int[] arr={1,2,3,4,5,6,7};
	int searchKey=6;
	int k=findElement(arr, searchKey);
	System.out.println(k);
	int searchKey1=7;
	int m=findElement(arr, searchKey1);
	System.out.println(m);
}
}
