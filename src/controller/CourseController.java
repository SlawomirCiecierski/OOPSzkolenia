package controller;

import model.Course;
import model.Participant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CourseController {

    private List<Course> courses = new ArrayList<>();

    ParticipantControler ppp = new ParticipantControler();

    public void addCourse(String name_of_course, String kategory, String term_of_course, String trener) {
        Course co = new Course(name_of_course, kategory, term_of_course, trener);
        courses.add(co);
        System.out.println("Course added! " + co);

    }

    public void deleteCourse(String name_of_course) {

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getName_of_course().equals(name_of_course)) {
                //sout musi być przed operacją usunięcia
                System.out.println("Został usunięty kurs =-> " + courses.get(i));
                //usunięcie
                courses.remove((courses.get(i)));
                break;

            }
        }System.out.println("          ---===>Nie usunięto. Brak?<===---");

    }

    public void getAllCourses() {
        System.out.println("Wykaz kursów: ");


        for (Course course : courses) {

            System.out.println(course);
            ppp.getAllParticipantsByKurs(course.getName_of_course());


        }
    }



}