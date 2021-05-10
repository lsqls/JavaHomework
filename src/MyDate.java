import java.io.Serializable;
import java.util.GregorianCalendar;

public class MyDate implements Serializable {
    private int year;
    private int month;
    private int day;

    MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }


    MyDate(long elapsedTime) {
        this();
        setDate(elapsedTime);
    }


    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return   this.getYear() +
                "/" + this.getMonth() +
                "/" + this.getDay();
    }

    public static void main(String[] args) {
        MyDate myDate1=new MyDate(),myDate2=new MyDate(2147483648000L);
        System.out.println(myDate1);
        System.out.println(myDate2);
    }
}