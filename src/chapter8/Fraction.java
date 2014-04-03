
package chapter8;

public class Fraction
{
    private int a,b;

    public Fraction()
    {
        a =  0;
        b =  1;
    }

    public Fraction(int a1, int b1)
    {
        if (b1!=0)
        {
            a =  a1;
            b =  b1;
        }
        else
            System.out.println("The fraction is INVALID.");

    }

    public Fraction(Fraction f)
    {
        a =  f.a;
        b =  f.b;
    }

    public static double Add(Fraction f1, Fraction f2)
    {
        double result = 0.0;
        result = f1.a*
        return result;
    }


}
