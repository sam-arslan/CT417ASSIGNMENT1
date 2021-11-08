
package CT417Assignment1;

import java.util.*;


public class Module {

    String name, ID;
    HashMap<String,String> studentList, courseList;

    public Module(String name, String id){
        this.name = name;
        this.ID = id;

        studentList = new HashMap<String,String>();
        courseList = new HashMap<String, String>();

    }

    public String getName(){
        return name;
    }

    public String getID(){
        return ID;
    }

    public HashMap<String,String> getStudentList() {
        return studentList;
    }

    public HashMap<String,String> getCourseList(){
        return courseList;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setID(String id){
        this.ID = id;
    }
    public void setStudentList(HashMap<String,String> sl){
        studentList = sl;
    }

    public void setCourseList(HashMap<String,String> cl){
        courseList = cl;
    }

    public void addStudent(String s){
        studentList.put(s, s);
    }

    public void addCourse(String s){
        courseList.put(s, s);
    }
}