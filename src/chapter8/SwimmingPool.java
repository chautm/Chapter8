package chapter8;

public class SwimmingPool
{
    private double Length, Width, Depth, FillingRate, DrainingRate;

    public SwimmingPool()
    {
        Length = 0.0;
        Width = 0.0;
        Depth = 0.0;
        FillingRate = 0.0;
        DrainingRate = 0.0;
    }

    public SwimmingPool(double Len,double Wid,double Dep,double FRate,double DRate)
    {
        Length = Len;
        Width = Wid;
        Depth = Dep;
        FillingRate = FRate;
        DrainingRate = DRate;
    }

    public SwimmingPool(SwimmingPool p)
    {
        Length = p.Length;
        Width = p.Width;
        Depth = p.Depth;
        FillingRate = p.FillingRate;
        DrainingRate = p.DrainingRate;
    }

    public void SetLength(double len)
    {
        if (len>=0)
            Length = len;
        else
            System.out.println("The value of Length is INVALID.");
    }

    public void SetWidth(double w)
    {
        if (w>=0)
            Width = w;
        else
            System.out.println("The value of Width is INVALID.");
    }

    public void SetDepth(double d)
    {
        if (d>=0)
            Depth = d;
        else
            System.out.println("The value of Depth is INVALID.");
    }

    public void SetFillingRate(double FR)
    {
        if (FR>=0)
            FillingRate = FR;
        else
            System.out.println("The value of Filling Rate is INVALID.");
    }

    public void SetDrainingRate(double DR)
    {
        if (DR>=0)
            DrainingRate = DR;
        else
            System.out.println("The value of Draining Rate is INVALID.");

    }

    public double GetLength()
    {
        return Length;
    }

    public double GetWidth()
    {
        return Width;
    }

    public double GetDepth()
    {
        return Depth;
    }

    public double GetFillingRate()
    {
        return FillingRate;
    }

    public double GetDrainingRate()
    {
        return DrainingRate;
    }

    public String toString()
    {
        return "Length: " + Length + "\nWidth: " + Width + "\nDepth: " + Depth + "\nFilling Rate: " + FillingRate + "\nDraining Rate: " + DrainingRate;
    }

    public double WaterNeeded()
    {
        double w; //gallons
        w = Depth * Width * Length;
        return w;
    }

    public double TimeNeededToFill()
    {
        double m; // minutes
        m = (Depth * Width * Length)/FillingRate;
        return m;
    }

    public double TimeNeededToEmpty()
    {
        double m;// minutes
        m = (Depth * Width * Length)/DrainingRate;
        return m;
    }

    public double WaterAdded( double m)
    {
        return (m * FillingRate);
    }

    public double WaterDrained( double m)
    {
        return (m * DrainingRate);
    }
}
