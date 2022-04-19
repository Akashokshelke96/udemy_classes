package com.sourceCode.Day3;

import java.io.*;

public class Application {
    public static void main(String[] args) {

        File file = new File("myFile.txt");

        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);) {


            String line = bufferedReader.readLine();

            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Readline unable to function" + file.getName());
            e.printStackTrace();
        }
        }
    }

