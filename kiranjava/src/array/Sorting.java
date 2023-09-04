package array;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a []= {1,0,3,2};
		int n = a.length;
		System.out.println("Array elements before sorting:  "+ Arrays.toString(a));
		for(int i =0; i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])  // a[j]<a[j+1]  for descending order
				{
					System.out.println("Ittration ");
					int temp =a[j];    // a= b
					a[j]=a[j+1];       // b=c
					a[j+1]=temp;       // c =a
					
				}
				
			}
		}
		System.out.println("array elements after sorting:  "+ Arrays.toString(a));

	}

}
