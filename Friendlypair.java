/*program to find if the given two numbers are friendly pairs or not. friendly pair are two or more numbers with common abundance.
*/
import java.util.Scanner;
class Friendlypair{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
	int n1,n2;
	n1 = obj.nextInt();
	n2 = obj.nextInt();
	int[] a = new int[10];
	int[] b = new int[10];
	int sum1=0;
	int sum2=0;
	for(int i=1;i<=(n1/2)+1;i++)
	{
		if(n1%i==0)
		{
			sum1+=i;
		}
	}
	for(int i=1;i<=(n2/2)+1;i++)
	{
		if(n2%i==0)
		{
			sum2+=i;
		}
	}
	if(n2==1)
	{
		sum2+=1;
	}
	if(n1==1)
	{
		sum1+=1;
	}
	if(n1/sum1 == n2/sum2)
	{
		System.out.println("The given pairs are friendly");
	}	
	}
	
}
