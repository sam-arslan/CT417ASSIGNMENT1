/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CT417Assignment1.CourseProgramme;
import CT417Assignment1.Module;
import CT417Assignment1.Student;
import java.util.logging.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.joda.time.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class JUnitTest {

    Student student;

    CourseProgramme ece;

    @Test
    public void test1(){
        ece = new CourseProgramme("Electronic and Computer Engineering",(new LocalDate( 2021 , 7 , 20 )), (new LocalDate( 2022 , 1 , 20 )));
        ece.addModule(( new Module("Embedded Systems Application Programming","CT347") ));          //
        ece.addModule(( new Module("Software Engineering III","CT417") ));                          //  Creating instances of
        ece.addModule(( new Module("Systems on Chip Design I","EE451") ));                          //  each module with module name
        ece.addModule(( new Module("System on Chip Design II","EE452") ));                          //  and ID
        ece.addModule(( new Module("Mobile Networks: Architecture and Services","EE4101") ));       //

        //testing: addition of new Student Object|addCourse()
        student = new Student("Craig", 21, "29/2/00");
        student.addCourse(ece);             //Adds ece as course programme

        //testing: getModuleList()|addCourse()|getProgrammeName()
        for(String string: ece.getModuleList().keySet())
            ece.getModuleList().get(string).addCourse(ece.getProgrammeName());
        //
        for(String string: ece.getModuleList().keySet())
            student.addModule(ece.getModuleList().get(string));

        //testing: Adding student to course|addStudent()
        ece.addStudent(student);

        assertEquals(student.getUsername(), "Craig21");
        assertEquals(ece.getStudent("Craig").getName(),"Craig");

        assertEquals(student.getModules().get("Embedded Systems Application Programming").getID(), "CT347");
        assertEquals(student.getCourses().get("Electronic and Computer Engineering").getProgrammeName(),
                "Electronic and Computer Engineering");

        assertEquals(ece.getStart(), (new LocalDate( 2021 , 7 , 20 )));
        assertEquals(ece.getEnd(), (new LocalDate( 2022 , 1 , 20 )));


    }

    public JUnitTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {


    }

    @AfterEach
    public void tearDown() {
    }

}