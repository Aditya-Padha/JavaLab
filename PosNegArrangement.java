/******************************************************************************

rearrange the positive and negative numbers in an array

start traversing the array, if the current element is negative,swap the currrent
element with the 1st positive and continue traversing until all elements have been
sorted

input: 1 -1 2 -2 3 -3
output: -1 -2 -3 1 3 2


*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class PosNegArrangement
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
		for(int i=0;i<n;i++)
		{
		    int temp;
		    if(arr[i] < 0)
		    {
		        for(int j=0;j<n;j++)
		        {
		            if(arr[j] > 0 && arr[i] < 0)
		            {
		                temp = arr[j];
		                arr[j] = arr[i];
		                arr[i] = temp;
		            }
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
