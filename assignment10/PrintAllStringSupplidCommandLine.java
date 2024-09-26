package assignment10;

import java.io.SyncFailedException;

public class PrintAllStringSupplidCommandLine {
    public static void main(String []args){
        for(int i=0;i<args.length;i++){
            System.out.println("command line strings are = " +(1+i) +" : " +args[i]);
        }
    }
}
