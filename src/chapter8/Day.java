
package chapter8;
import java.util.*;

public class Day
{
    private int CurrentDay = 0;
    static Scanner console = new Scanner(System.in);

    public Day()
    {
        CurrentDay = 0;
    }

    public Day(String day)
    {
        CurrentDay = NumOfWeek(day);
    }

    public Day(Day d)
    {
        CurrentDay = d.CurrentDay;
    }

     public void SetDay(String day)
    {
        CurrentDay = NumOfWeek(day);
    }

    public String GetDay()
    {
        return DayOfWeek(CurrentDay);
    }

    public String NextDay()
    {
        if (CurrentDay == 7)
            return DayOfWeek(1);
        else
            return DayOfWeek(CurrentDay+1);
    }
    
    public String PreviousDay()
    {
        if (CurrentDay == 1)
            return DayOfWeek(7);
        else
            return DayOfWeek(CurrentDay-1);
    }
    
    public String toString()
    {
        return DayOfWeek(CurrentDay);
    }

    public void UserInput()
    {
        do
        {
            System.out.print("Please enter current day (Mon ~ Sun): ");
            CurrentDay = NumOfWeek(console.next());
        } while (CurrentDay==0);
    }
    
    public String AddDays(int NumOfDays)
    {
        if ((CurrentDay + NumOfDays)<=7 )
            return DayOfWeek(CurrentDay + NumOfDays);
        else
            return DayOfWeek((CurrentDay + NumOfDays) % 7 );
    }
    
    private String DayOfWeek(int num)
    {
        switch (num)
        {
            case 1:
                return "Mon";
            case 2:
                return "Tue";
            case 3:
                return "Wed";
            case 4:
                return "Thu";
            case 5:
                return "Fri";
            case 6:
                return "Sat";
            case 7:
                return "Sun";
        }
        return "";
    }

    private int NumOfWeek(String day)
    {
        String str="";
        str = day.toLowerCase();

        if (str.compareTo("mon") == 0)
                return 1;
        else if (day.compareTo("tue") == 0)
                return 2;
        else if (day.compareTo("wed") == 0)
                return 3;
        else if (day.compareTo("thu") == 0 )
                return 4;
        else if (day.compareTo("fri") == 0)
                return 5;
        else if (day.compareTo("sat")==0 )
                return 6;
        else if (day.compareTo("sun")==0)
                return 7;        
        return 0;
    }
}
