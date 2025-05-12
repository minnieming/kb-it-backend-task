package main.java.java13_250510sat.basic.ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {
        // file 객체 생성
        File dir = new File("/Users/minnie/Temp/images"); // File : 파일과 디렉토리 정보를 가지고 있는 클래스
        File file1 = new File("/Users/minnie/Temp/file1.txt");
        File file2 = new File("/Users/minnie/Temp/file2.txt");
        File file3 = new File("/Users/minnie/Temp/file3.txt");

        // 파일이 없다면 디렉토리 or 파일 생성
        if (dir.exists() == false) { dir.mkdirs();}
        if (file1.exists() == false) {file1.mkdirs();}
        if (file2.exists() == false) {file2.mkdirs();}
        if (file3.exists() == false) {file3.mkdirs();}

        // Temp 폴더의 내용을 출력
        File temp = new File("/Users/minnie/Temp");
        File[] contents = temp.listFiles(); // 디렉토리에 포함된 파일, 서브 디렉토리 목록 전부를 file 배열로 리턴
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm"); //새로운 포맷으로 sdf 객체 생성

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
