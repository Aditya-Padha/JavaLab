/******************************************************************************
sort an array in zig zag fashion
give size
input:
7
4 3 7 8 6 2 1
output:
3 7 4 8 2 6 1

4
1 4 3 2
output:
1 4 2 3

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class ZigZagSort
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n;
		n = obj.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = obj.nextInt();
		}
		boolean flag = true;
		int temp = 0;
		for(int i=0;i<=n-2;i++)
		{
		    if(flag)
		    {
		        if(arr[i] > arr[i+1])
		        {
		            temp = arr[i];
		            arr[i] = arr[i+1];
		            arr[i+1] = temp;
		        }
		    }
		    else
		    {
		        if(arr[i] < arr[i+1])
		        {
		            temp = arr[i];
		            arr[i] = arr[i+1];
		            arr[i+1] = temp;
		        }
		    }
		    
		    flag = !flag;
		
		}
		System.out.println(Arrays.toString(arr));
	}
}
