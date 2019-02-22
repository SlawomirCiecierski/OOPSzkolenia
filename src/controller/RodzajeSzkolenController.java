package controller;

import model.RodzajeSzkolen;

import java.util.ArrayList;
import java.util.List;

public class RodzajeSzkolenController {


    private List<RodzajeSzkolen> name_of_course = new ArrayList<>();


    public void addRodzajeSzkolen(String nazwa_kursu) {
        RodzajeSzkolen a = new RodzajeSzkolen(nazwa_kursu);
        name_of_course.add(a);
        System.out.println("Zamówienie przyjęte! " + a);

    }

    public void getAllRodzajeSzkolen() {
        System.out.println("DOSTĘPNE SZKOLENIA");
//        for (RodzajeSzkolen szkol : name_of_course) {
//            System.out.println(name_of_course);
//        }
        System.out.println(name_of_course);
    }
}
