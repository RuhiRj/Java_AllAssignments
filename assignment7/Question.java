package assignment7;

public class Question {
    int queno;
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;
    void setQuestion(int x,String question,String optionA,String optionB,String optionC,String optionD,String answer){
        queno=x;
        this.question=question;
        this.optionA=optionA;
        this.optionB=optionB;
        this.optionC=optionC;
        this.optionD=optionD;
        this.answer=answer;
    }
    void displayQuestion() {
       System.out.println("question number is=" +question);
       System.out.println("question = " +question);
       System.out.println("option a is = " +optionA);
        System.out.println("option b is = " +optionB);
        System.out.println("option c is = " +optionB);
        System.out.println("option d is = " +optionD);
        System.out.println("answer is = " +answer);
    }

}
class ShowQuestionAns{
    public static void main(String[] args){
        Question q1=new Question();
        q1.setQuestion(1,"who is the father of AI","John McCarthy","Alan Turing","Marvin Minsky",
                "Marvin Minsky","A");
        q1.displayQuestion();
    }
}
