
package chapter8;

public class Fraction
{
    private int top,bottom;

    public Fraction()
    {
        top =  0;
        bottom =  1;
    }

    public Fraction(int a1, int b1)
    {
        if (b1!=0)
        {
            top =  a1;
            bottom =  b1;
        }
        else
            System.out.println("The fraction is INVALID.");

    }

    public Fraction(Fraction f)
    {
        top =  f.top;
        bottom =  f.bottom;
    }

    public static double Add(Fraction f1, Fraction f2)
    {
        double result = 0.0;
        result = f1.top;
        return result;
    }


}
