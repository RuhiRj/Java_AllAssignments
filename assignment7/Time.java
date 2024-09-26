package assignment7;

public class Time {
    int hour;
    int minute;
    int second;
    void setTime(int h,int m,int s){
        hour=h;
        minute=m;
        second=s;
    }
    void showtime(){
        System.out.println("hour=" +hour);
        System.out.println("minutes=" +minute);
        System.out.println("seconds=" +second);
    }
}
class Example1{
    public static void main(String[] args){
        Time t1=new Time();
        t1.setTime(3,45,20);
        t1.showtime();
    }
}