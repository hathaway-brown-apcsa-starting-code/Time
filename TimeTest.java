
/**
 * A test program for the Time class
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimeTest
{
    public static void main (String[] args)
    {
        Time myTime = new Time (10, 50, 00);  
        System.out.println(myTime);    // tests the output of Time.toString()
        
        myTime.addTime(new Time (0, 5, 0));     // add 5 minutes and test.  
        System.out.println(myTime);             // should be 10:55
        myTime.addTime(new Time (2, 0, 0));     // add 2 hours and test
        System.out.println(myTime);             // should be 12:55
        myTime.addTime(new Time (4, 20, 0));    // add 4 hours 20 minutes and test
        System.out.println(myTime);             // should be 17:15
        myTime.addTime(new Time (12, 0, 0));    // add 12 hours; should cycle to AM
        System.out.println(myTime);             // should be 5:15
        
        Time time2;
        time2 = myTime.elapsedTime (new Time (5, 45, 0));
        System.out.println(time2);             // should be 00:30
        time2 = myTime.elapsedTime (new Time (10, 30, 0));
        System.out.println(time2);             // should be 05:15
        time2 = myTime.elapsedTime (new Time (12, 00, 0));
        System.out.println(time2);             // should be 06:45
    }
}
