package org.example;

import org.example.intefaces.StudentIfe;

import java.nio.charset.Charset;
import java.util.Random;

public class Student implements StudentIfe {
    private String firstname;
    private String lastname;

    int discipline = 0;
    public Student(String name, String lastname, int discipline){
        this.firstname = name;
        this.lastname = lastname;
        this.discipline = discipline;
    };

    public String prepare(){
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        return generatedString;
    };

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String value) {
        firstname = value;
    }

    public void setLastname(String value) {
        lastname = value;
    }
}
