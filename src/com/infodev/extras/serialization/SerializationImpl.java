package com.infodev.extras.serialization;

import java.io.*;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class SerializationImpl {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //object instantiated
        Student student = new Student(1,"John Doe","Nepal");
        student.setPassword("Hello123");

        //serialization into a file is done
        File file = new File("C:\\Users\\Nabin\\Desktop\\WICC\\WICC-Java\\src\\com\\infodev\\extras\\serialization\\ObjectData.txt");
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(student);

        //deserialization from a file to object is done
        FileInputStream fin = new FileInputStream(file);
        ObjectInputStream oin = new ObjectInputStream(fin);
        Student restoredStudent = (Student) oin.readObject();
        //prints deserialized object
        System.out.println(restoredStudent);

        oout.close();
        oin.close();
        fout.close();
    }
}
