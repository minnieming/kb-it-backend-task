package main.java.java13_250510sat.advanced.ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample2 {
    public static void main(String[] args) throws Exception {
        File dir = new File("/Users/minnie/Temp/images");

        if (dir.exists() == false) {
            dir.mkdir();
        }

        // 출력 스트림
        File temp = new File("/Users/minnie/Temp"); // 폴더의 내용 출력
        File[] contents = temp.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        for (File file : contents) {
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));

            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}
