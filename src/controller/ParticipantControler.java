package controller;

import model.Course;
import model.Participant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ParticipantControler {

    private List<Participant> added_participants = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Participant> temp = new ArrayList<>();


    public void addParticipant(String kurs_kursanta, String first_name, String last_name) {
        Participant pa = new Participant(kurs_kursanta, first_name, last_name);
        added_participants.add(pa);
        System.out.println("Participant added! " + pa);
    }


    public void deleteParticipant(String last_name) {

        for (int i = 0; i < added_participants.size(); i++) {
            if (added_participants.get(i).getLast_name().equals(last_name)) {
                //sout musi być przed operacją usunięcia
                System.out.println("Został usunięty kursant =-> " + added_participants.get(i));
                //usunięcie
                added_participants.remove((added_participants.get(i)));

            } else {
                System.out.println("          ---===>Nie usunięto. Brak?<===---");

            }
        }

    }

    public void getAllParticipants() {
        System.out.println("Wykaz kursantów: ");
        for (Participant added_participant : added_participants) {
            System.out.println(added_participant);

        }
    }

    public void getAllParticipantsByKurs(String nazwa_szkolenia) {

        System.out.println("Wykaz kursantów kursu: ");

        for (int i = 0; i < added_participants.size(); i++) {
            if (added_participants.get(i).getKurs().equals(nazwa_szkolenia)) {
                //temp.add(added_participants.get(i));
                System.out.println(added_participants.get(i));
            }
        }


    }


}
