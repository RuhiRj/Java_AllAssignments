package FileHandling;
import java.io.*;
import java.util.Scanner;
public class File1 {
    public void f1() throws IOException {
        int i;
        FileOutputStream fout;
        fout = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\assignments_project\\src\\Files/myData.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the company name");
        String name = sc.nextLine();
        for (i = 0; i < name.length(); i++)
            fout.write(name.charAt(i));
        fout.close();
        System.out.println("Data Store in File");
    }

    public void f2() throws IOException {
        int i;
        FileOutputStream fout;
        fout = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\assignments_project\\src\\Files/myData.txt",true);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the company name");
        String name = sc.nextLine();
        for (i = 0; i < name.length(); i++)
            fout.write(name.charAt(i));
        fout.close();
        System.out.println("Data Store in File");
    }
    public void f3() throws IOException{
        int i;
        FileInputStream fin=new FileInputStream("C:\\Users\\user\\IdeaProjects\\assignments_project\\src\\Files/myData.txt");
    do{
        i=fin.read();
        if(i!=-1){
            System.out.println((char) (i));
        }
    }while(i!=-1);
    fin.close();
    }
    public void f4() throws IOException{
        FileWriter file=new FileWriter("C:\\Users\\user\\IdeaProjects\\assignments_project\\src\\Files/fileData.txt");
        BufferedWriter bf=new BufferedWriter(file);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the company name");
        String name=sc.nextLine();
        bf.write(name);
        bf.close();

    }
    public void f5() throws IOException{
        FileReader file=new FileReader("C:\\Users\\user\\IdeaProjects\\assignments_project\\src\\Files/fileData.txt");
        BufferedReader bf=new BufferedReader(file);
       String s1= bf.readLine();
        bf.close();
        System.out.println(s1);

    }
}