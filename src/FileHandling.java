import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public void file() {
        File myfile = new File("this.txt");
        //creating a new File
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("the file could not be created");
            e.printStackTrace();
        }
        try {
            FileWriter fileWriter = new FileWriter("this.txt",true);
            String s = "i am trying to write in this file";
            String s1 = "this is the next line";
            int val = 2;
            char[] c={'p','a','l','i'};

            fileWriter.write(s + val + " " + "\n" + s1 + "\n" + "this is a new file\n");
            fileWriter.write(c);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("could not string in this file");
            e.printStackTrace();
        }


        //reading the file using FileReader

        try {
            FileReader fr=new FileReader(myfile);
            char[] c=new char[4];
            fr.read(c);
            for(char x:c){
                System.out.println(x);
            }
            fr.close();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }


        //reading the file

        //siddai afai txt file ma lekhera read gareko using Scanner
        try {
            File myfile1 = new File("abc.txt");
            Scanner sc = new Scanner(myfile1);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("could not read the file");
            e.printStackTrace();
        }

        // write() use garera paxi feri read gareko
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // delete
        File myfile2 = new File("xyz.txt");
        try {
            myfile2.createNewFile();
        } catch (IOException e) {
            System.out.println("could not create new file");
        }
        if (myfile2.delete()) {
            System.out.println("the deleted file is" + myfile2.getName());
        } else {
            System.out.println("the file has not been deleted");
        }


        File file1 = null;
        try {
            file1 = myfile.getCanonicalFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file1);
        boolean b;
        b = myfile.exists();
        System.out.println(b);


        //renaming the this.txt file
        File myfile3 = new File("old.txt");
        try {
            myfile3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File myfile4 = new File("new.txt");
        if (myfile3.exists()) {
            System.out.println(myfile3.renameTo(myfile4));
        } else {
            System.out.println("the file could not be renamed");
        }
        myfile2.isDirectory();

    }
}
