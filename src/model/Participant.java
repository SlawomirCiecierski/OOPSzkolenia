package model;

import java.util.*;

public class Participant {

    private String kurs_kursanta, first_name, last_name;
    private List<String> par_kurs = new ArrayList<>(Arrays.asList("Fortran","Java","C++"));
    private List<String> par_first_name = new ArrayList<>(Arrays.asList("Józef","Adolf","Włodzimierz"));
    private List<String> par_last_name = new ArrayList<>(Arrays.asList("Stalin","Hitler","Lenin"));
    private List<List> added_participants = new ArrayList<>(Arrays.asList(par_kurs, par_first_name, par_last_name));


    public Participant(String kurs_kursanta, String first_name, String last_name) {
        this.kurs_kursanta = kurs_kursanta;
        this.first_name = first_name;
        this.last_name = last_name;

    }

    @Override
    public String toString() {
        return String.format("%20s | %15s | %15s |  " ,
                            kurs_kursanta, first_name, last_name);

    }

    public String getKurs() {
        return kurs_kursanta;
    }

    public void setKurs(String kurs_kursanta) {
        this.kurs_kursanta = kurs_kursanta;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}






