package assignment7;

public class Course {
    int courseId;
    String courseName;
    String duration;
    float fee;
    void setCourseId(int courseId ){
        this.courseId=courseId;
    }
    void setCourseName(String courseName ){
        this.courseName=courseName;
    }
    void setCourseDuration(String duration ){
        this.duration=duration;
    }
    void setCourseFee(float fee ){
        this.fee=fee;
    }
    int getCourseId( ){
        return courseId;
    }
    String getCourseName( ){
        return courseName;
    }
    String getCourseDuration( ){
        return duration;
    }
    float getCourseFee( ){
        return fee;
    }
}
class CourseDetail{
    public static void main(String[] args){
        Course c1=new Course();
        c1.setCourseId(23);
        int id=c1.getCourseId();
        System.out.println("course id is = " +id);
        c1.setCourseName("MCA");
        String coursename=c1.getCourseName();
        System.out.println("course name is = " +coursename);
        c1.setCourseDuration("two years");
        String duration=c1.getCourseDuration();
        System.out.println("course duration is = " +duration);
        c1.setCourseFee(130000f);
        float fee=c1.getCourseFee();
        System.out.println("course fee is = " +fee);
    }
}
