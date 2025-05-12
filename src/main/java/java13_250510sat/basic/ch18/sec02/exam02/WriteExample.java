package main.java.java13_250510sat.basic.ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("/Users/minnie/Temp/test2.db");

            byte[] array = {10, 20, 30};

            os.write(array);
            os.flush();
            os.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
