package Universe;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class A8 {
    public void Driver(){
    SuperCar sc=SuperCar.getInstance();
    }
}
class Account{
    private String accountNumber,customerName;
    private double balance;
    private static double rateOfInterest;
    public void setAccountNumber(String accountnumber){accountNumber=accountnumber;}
    public void setBalance(double balance){this.balance=balance;}
    public void setCustomerName(String customername){customerName=customername;}
    public static void  setRateOfInterest(double interest){Account.rateOfInterest=interest;}
    public String getCustomerName(){return customerName;}
    public String getAccountNumber(){return accountNumber;}
    public double getBalance(){return balance;}
    public static double getRateOfInterest(){return rateOfInterest;}
    public void calculateSimpleInterest(int time){
        double si;
        si=rateOfInterest*time*balance/100.0;
        System.out.println("simple interest is = "+si);
    }
}
class SuperCar{
    private String ownerName;
    private double price;
    private String colour;
    private String brand;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    private SuperCar(){
    }
    /*private static int countInstance;
    public static SuperCar getInstance(){
        if(countInstance==0){
            countInstance++;
            return new SuperCar();
        }
        return null;
    }*/
    private static SuperCar ref;
    public static SuperCar getInstance(){
        if(ref==null){
            ref =new SuperCar();
            return  ref;
        }
        return null;
    }
}
class Video{
    private String title;
    private int views,likes,videoId;
    private static int totalVideo;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViews() {
        return views;
    }

    public static int getTotalVideo() {
        return totalVideo;
    }

    public static void setTotalVideo(int totalVideo) {
        Video.totalVideo = totalVideo;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
}
class Batch{
    private int batch_code,student_count;
    private String course_name;
    private LocalDateTime startDate;//reference variable
    private LocalDateTime startTime;
    private String day;
    private static int totalNumberOfBatches;

    public int getBatch_code() {
        return batch_code;
    }

    public void setBatch_code(int batch_code) {
        this.batch_code = batch_code;
    }

    public int getStudent_count() {
        return student_count;
    }

    public void setStudent_count(int student_count) {
        this.student_count = student_count;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public static int getTotalNumberOfBatches() {
        return totalNumberOfBatches;
    }

    public static void setTotalNumberOfBatches(int totalNumberOfBatches) {
        Batch.totalNumberOfBatches = totalNumberOfBatches;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}
class Box{
    private int length,breadth,height;
    private static int boxCount;
    public void setDimension(int l ,int b ,int h){
        length=l;
        breadth=b;
        height=h;
    }
    public void getDimension(){
        System.out.println("length is " +length);
        System.out.println("length is " +breadth);
        System.out.println("length is " +height);
    }
    public static void showBoxCount(){
        System.out.println("show box count is "+boxCount);
    }

}