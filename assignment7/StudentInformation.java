package assignment7;

public class StudentInformation {
    int studentID;
    String firstName;
    String lastName;
    String mobileNo;
    String emailId;
    void setStudentID(int id){
        studentID=id;
    }
    void setFirstName(String firstName){
        this.firstName=firstName;
    }
    void setLastName(String lastName){
        this.lastName=lastName;
    }
    void setMobileNo(String mobileNo){
        this.mobileNo=mobileNo;
    }
    void setEmailId(String emailId){
        this.emailId=emailId;
    }
    int getStudentID(){
        return studentID;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    String getMobileNo(){
        return mobileNo;
    }
    String getEmailId(){
        return emailId;
    }
}
class ShowStudentInformation{
    public static void main(String [] args){
        StudentInformation s1=new StudentInformation();
        s1.setStudentID(11);
        int id=s1.getStudentID();
        System.out.println("student id = " +id);
        s1.setFirstName("Ruhi");
        String firstname=s1.getFirstName();
        System.out.println("student first name = " +firstname);
        s1.setLastName("Raj");
        String lastname=s1.getLastName();
        System.out.println("student last name = " +lastname);
        s1.setMobileNo("8235140333");
        String mobileNo=s1.getMobileNo();
        System.out.println("student mobile number = " +mobileNo);
        s1.setEmailId("ruhiraj56709@gmail.com");
        String email=s1.getEmailId();
        System.out.println("student email is = " +email);
    }
}
