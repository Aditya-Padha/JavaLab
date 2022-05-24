/******************************************************************************

Write a java program to implement abstract class and abstract method with following details:
create an abstract base class temperature
data temp;
method members:
void settemp(double)
abstract void changetemp()

sub class fahrenheit(subclass of temperature)
data members:
double ctemp;
method members:
Override abstract method changetemp() to convert fahrenheit to celsius by using formula

sub class fahrenheit(subclass of temperature)
data members:
double ftemp;
method members:
Override abstract method changetemp() to convert celsius to fahrenheit by using formula
*******************************************************************************/
abstract class temperature{
    double temp;
    abstract void settemp(double t);
    abstract void changetemp();
}
class fahrenheit extends temperature{
    double ctemp;
    void settemp(double t)
    {
        temp = t;
    }
    void changetemp()
    {
        ctemp = (temp - 32) / 1.8;
        System.out.println("The temp is changed from fahrenheit: " + temp + " to celcius: " + ctemp);
    }
}
class celsius extends temperature{
    double ftemp;
    void settemp(double t)
    {
        temp = t;
    }
    void changetemp()
    {
        ftemp = (temp * 1.8) + 32;
        System.out.println("The temp is changed from celcius: " + temp + " to fahrenheit: " + ftemp);
    }
}
public class Main
{
	public static void main(String[] args) {
		fahrenheit f = new fahrenheit();
		celsius c = new celsius();
		f.settemp(78);
		f.changetemp();
		c.settemp(25);
		c.changetemp();
	}
}
