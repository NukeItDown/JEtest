package org.example;

import org.example.intefaces.TeacherIfe;


public class Teacher implements TeacherIfe {

    private int work_experience;
    String firstname;
    String lastname;

    int discipline;
    public Teacher(String name, String lastname, int discipline){
        this.firstname = name;
        this.lastname = lastname;
        this.discipline = discipline;
    };
    public int exam(int student_discipline, String test){
        if(this.discipline == student_discipline && !test.isEmpty()){
            return 10;
        }
        return 0;
    }

    public String profile(){
      return this.firstname+" "+this.lastname+", "+this.discipline+", we:"+work_experience;
    };

    public void setWork_experience(int work_experience) {
        this.work_experience = work_experience;
    }
}
