package FileHandling;
/*
file belongs to io class of java..

DataInputStream- used to fetch the text from the FileInputStream object and send it to Output
DataOutputStream- used to store the text from the code and sent it to FileOutputStream

File Class- we create a object of file to give the path and name of the file so, if we need to update 
we just need to change the path in one place( in file object creation)

FileInputStream- used to fetch the text from the file directly and sends it to DataInputStream
FileOutputStream-used to fetch the text from DataOutputStream object and sends it to file 

IOException- whenever we use file or file related programs it is good to use expections in some cases file may not be 
created/available so it will throw an error. to reduce or resolve that we are using expections.

*/
import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

public class File_Write {

    public static void main(String[] args) throws IOException {
        File f
        = new File("C:/Users/yuvar/Documents/NetBeansProjects/JavaFullCourse/src/FileHandling/Files/demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Demo Content");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();

        System.out.println(str);
    }

}
