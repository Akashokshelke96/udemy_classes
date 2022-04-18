package com.sourceCode.Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Appilcation {
    public static void main(String[] args) throws Exception {
//        for(int i = 0; i <=3 ; i++) {
//            Scanner input = new Scanner(System.in);
//            String outdata = input.nextLine();
//            System.out.println(outdata);
//        }
//    }
//        File file = new File("myFile.txt");
//        Scanner input = new Scanner(file);
//        while ((input.hasNextLine())){
//            String line = input.nextLine();
//            System.out.println(line);
//        }
//        input.close();

        MyFileUtils myFileUtils = new MyFileUtils();
        System.out.println(myFileUtils.subtract10FromLargerNumber(2));

    }


}
