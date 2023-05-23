package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class File_Properties {

    public static void main(String[] args) throws IOException {
        File f = new File("C:/Users/yuvar/Documents/NetBeansProjects/JavaFullCourse/src/FileHandling/Files/DemoProp.properties");

        Properties p = new Properties();
        //To Write
        OutputStream os = new FileOutputStream(f);

        p.setProperty("url", "localhost:3306/localDB");
        p.setProperty("uname", "yuva");
        p.setProperty("pass", "123");

        p.store(os, null);

        //ToRead
        InputStream is = new FileInputStream(f);

        p.load(is);

        System.out.println("uname: " + p.getProperty("uname"));
        System.out.println("url: " + p.getProperty("url"));
        System.out.println("pass: " + p.getProperty("pass"));
    }

}
