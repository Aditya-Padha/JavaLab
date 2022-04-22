/******************************************************************************

program to find the saddle point coordinates in a given matrix. A saddle point
is an element of the matrix, which is the minimum in its own row but maximum in
its column.

Mat[3][3]
1 2 3
4 5 6
7 8 9
here, 7 is the saddle point because it is the minimum in its row and maximum in its column

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int[][] a = new int[3][3];
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        a[i][j] = ob.nextInt();
		    }
		}
		for(int i=0;i<3;i++)
		{
		    int min = a[i][0];
		    int col_idx=0;
		    for(int j=1;j<3;j++)
		    {
		        if(a[i][j] < min)
		        {
		            min=a[i][j];
		            col_idx = j;
		        }
		    }
		    
		    int k;
		    for(k=0;k<3;k++)
		    {
		        if(min<a[k][col_idx])
		        {
		            break;
		        }
		    }
		    if(k==3)
		    {
		        System.out.println("The Saddle Point is: "+ min);
		    }
		}
	}
}
