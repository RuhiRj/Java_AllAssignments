package assignment7;

public class Book {
    int bookId;
    String title;
    float price;
    String author;
    void setBookInformation(int bookId,String title,float price,String author){
        this.bookId=bookId;
        this.title=title;
        this.price=price;
        this.author=author;
    }
    void getBookInformation(){
        System.out.println("book id is = "+bookId);
        System.out.println("book title is = "+title);
        System.out.println("book price is = "+price);
        System.out.println("book author is = "+author);

    }
}
class ShowBookInformation{
    public static void main(String[] args){
        Book b1=new Book();
        b1.setBookInformation(21,"first cry",450f,"sudha murty");
        b1.getBookInformation();
    }
}
