package assignment11;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class PrintCurrentDate {
    public static void main(String[] args){
        LocalDate now=LocalDate.now();
      //  DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("current date is = " +now);
        //System.out.println("current date is = " +f.format(now ));
        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("current time is = " +f.format(now ));

    }
}
