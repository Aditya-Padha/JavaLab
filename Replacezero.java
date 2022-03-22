/*program to replace all 0's with 1's in the given number.
input: 102405
output:112415
*/
import java.util.Scanner;
class Replacezero{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int n;
		n = obj.nextInt();
		int k;		
		int nn=0;
		System.out.println("The previous number was: "+ n);
		while(n!=0)
		{
			k=n%10;
			if(k==0)
			{
				k=1;
			}
			n=n/10;
			nn=nn*10;
			nn += k;
		}
		System.out.println("The new number is: "+ nn);
	}
}
