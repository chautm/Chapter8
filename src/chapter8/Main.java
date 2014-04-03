package chapter8;

public class Main
{
    public static void main(String[] args)
    {
//        Chapter8Exer3();
        Chapter8Exer6();
    }

    public static void Chapter8Exer3()
    {
        int addDays = 10;

        Day d = new Day();

        d.UserInput();

        System.out.println("The current day is  " + d.GetDay());

        System.out.println("The next day of " + d + " is " + d.NextDay());

        System.out.println("The previous day of " + d + " is " + d.PreviousDay());

        System.out.println(addDays+" days after " + d + " is " + d.AddDays(addDays));
    }

    public static void Chapter8Exer6()
    {
        double min=23.0;

        SwimmingPool p = new SwimmingPool(2.3,4.5,4.5,56.0,78.0);

        SwimmingPool p1 = new SwimmingPool(p);

        System.out.println("The current value of Swimming Pool (p1) is:\n"+p1);
        System.out.println("");
        System.out.printf("Water needed to completely fill the pool is %.2f gallons \n" , p.WaterNeeded());
        System.out.printf("Time needed to fill the pool is %.2f minutes \n" , p.TimeNeededToFill());
        System.out.printf("Time needed to empty the pool is %.2f minutes \n" , p.TimeNeededToEmpty());
        System.out.printf("The water filled in %.2f minutes is %.2f gallons\n" ,min,p.WaterAdded(23));
        System.out.printf("The water drained in %.2f minutes is %.2f gallons\n" ,min, p.WaterDrained(23));
    }
}
