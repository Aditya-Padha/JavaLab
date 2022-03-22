import java.util.Scanner;
import java.lang.Math;
public class RDandSI{
	public static void main(String[] args){
		int ch;
		Scanner sc= new Scanner(System.in) ;
		System.out.println("\n1.RD calculation\n2.ST calculation: ") ;
		ch=sc.nextInt();
		switch (ch){
		case 1:
		double n,r,t,amt,p;
		System.out.println("Enter Reoccuring deposit: ");
		p=sc.nextInt();
		System.out.println("\nEnter rate: ");
		r=sc.nextInt();
		System.out.println("\nEnter time: ");
		t=sc.nextInt();
		System.out.println("\nEnter N: ");
		n=sc.nextInt();
		amt=Math.pow((p*(1+r/n)),(n*t));
		System.out.println("\nHello, your RD is " + amt);
		break;
		case 2:
		int ra, ti, amt2, pr;
		System.out.println("\nEnter Principal amount: ");
		pr = sc.nextInt();
		System.out.println("\nEnter rate: ");
		ra=sc.nextInt();
		System.out.println("\nEnter time: ");
		ti=sc.nextInt();
		amt2=pr*ra*ti/100;
		System.out.println("\nHello, your SI is" + amt2);
		break;
		}
	}
}	