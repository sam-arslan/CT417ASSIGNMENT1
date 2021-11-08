

package CT417Assignment1;

import CT417Assignment1.CourseProgramme;
import java.util.*;


public class Student {

    String name, dob, username;
    HashMap<String,CourseProgramme> courses;
    HashMap<String, CT417Assignment1.Module> modules;
    int age, id;

    public Student(String name, int age, String birthday){
        this.name = name;
        this.age = age;
        this.dob = birthday;

        courses = new HashMap<String,CourseProgramme>();
        modules = new HashMap<String, CT417Assignment1.Module>();
    }

    public String getUsername(){
        username = name + String.valueOf(age);
        System.out.println("Username: " + username);
        return username = name + String.valueOf(age);
    }

    public String getName(){

        return name;
    }

    public String getDoB(){

        return dob;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }

    public HashMap<String,CourseProgramme> getCourses(){
        return courses;
    }
    public HashMap<String, CT417Assignment1.Module> getModules(){
        return modules;
    }

    public void setName(String name){
        name = name;
    }

    public void setDoB(String birthday){
        dob = birthday;
    }

    public void setAge(int age){
        age = age;
    }

    public void addCourse(CourseProgramme newCourseProg){
        courses.put(newCourseProg.getProgrammeName(), newCourseProg);
    }

    public void addModule(CT417Assignment1.Module module){
        modules.put(module.getName(), module);
    }

}