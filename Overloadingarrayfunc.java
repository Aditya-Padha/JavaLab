/******************************************************************************


*******************************************************************************/

import java.util.Arrays;
public class Overloadingarrayfunc
{
    static void arrayfunc(int[] a,int target)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] + a[j] == target)
                {
                    System.out.println(a[i] + " + " + a[j] + " = " + target);
                }
            }
        }
    }
    static void arrayfunc(int[] a, int p, int[] b, int q)
    {
        int[] a1 = new int[p+q];
        int k=0;
        for(int i=0;i<p;i++)
        {
            a1[k] = a[i];
            k++;
        }
        for(int i=0;i<q;i++)
        {
            a1[k] = b[i];
            k++;
        }
        Arrays.sort(a1);
        for(int i=0;i<p;i++)
        {
            a[i] = a1[i];
        }
        int l=0;
        for(int i=p;i<p+q;i++)
        {
            b[l] = a1[i];
            l++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
	public static void main(String[] args) {
		int[] al = new int[]{4,6,5,-10,8,5,20};
		int target = 10;
		int[] a = new int[]{1,5,6,7,8,10};
		int[] b = new int[]{2,4,9};
		arrayfunc(al,target);
		arrayfunc(a, 6,b,3);
	}
}
