import controller.CourseController;
import controller.ParticipantControler;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public String nazwa_szkolenia;

  public static void main(String[] args) {
    CourseController cc = new CourseController();
    ParticipantControler pc = new ParticipantControler();
    Scanner sc = new Scanner(System.in);
    int decision = -1;

    while (decision != 0) {
      System.out.println("K U R S Y");
      System.out.println("Memu główne -> KURSY");
      System.out.println("1. Nowy kurs \n2. Usuń kurs \n3. Pokaż kursy \n4. Kursanci..\n0. Koniec programu");
      try {
        decision = sc.nextInt();
        sc.nextLine();
        switch (decision) {
          case 1:
            System.out.println("Podaj nazwę kursu:");
            String name_of_course = sc.nextLine();
            System.out.println("Podaj kategorię kursu:");
            String kategory = sc.nextLine();
            System.out.println("Podaj termin kursu:");
            System.out.println("Podaj date w formacie(dd-mm-rrrr  ");
            String term_of_course = sc.nextLine();
            System.out.println("Podaj trenera:");
            String trener = sc.nextLine();
            cc.addCourse(name_of_course, kategory, term_of_course, trener);
            System.out.println("Zapisano wiadomość");
            break;
          case 2:
            System.out.println("Podaj nazwę kursu do usunięcia:");
            String name_course = sc.nextLine();
            cc.deleteCourse(name_course);
            break;
          case 3:

            cc.getAllCourses();


            break;

          case 4:
            int decision_kursanci = -1;
            while (decision_kursanci != 0) {
              System.out.println("Menu  -> KURSANCI");
              System.out.println("1. Przypisz nowego kursanta \n2. Usuń kursanta \n3. Pokaż kursantów\n0. Powrót no menu głównego");
              decision_kursanci = sc.nextInt();
              sc.nextLine();
//MENU KURSANCI
              switch (decision_kursanci) {
                case 1:
                  //dodaj kursanta i przypisz do kursu
                  cc.getAllCourses();

                  System.out.println("Podaj nazwę kursu:");
                  String kurs_kursanta = sc.nextLine();
                  System.out.println("Podaj imię:");
                  String first_name = sc.nextLine();
                  System.out.println("Podaj nazwisko");
                  String last_name = sc.nextLine();

                  pc.addParticipant(kurs_kursanta, first_name, last_name);
                  System.out.println("Zapisano..");

                  break;
                case 2:
                  //usuń kursanta wg nazwiska
                  System.out.println("Podaj nazwisko kursanta");
                  String lastname = sc.nextLine();
                  pc.deleteParticipant(lastname);

                  break;
                case 3:
                  //pokazuje kursantów

                  pc.getAllParticipants();

                  break;
                case 0:
                  //decision_kursanci=-1;
                  break;
                default:
                  break;
              }
            }



          case 0:
            System.out.println("Dziękuję!");
            break;
          default:
            System.out.println("Błędny wybór");
            break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Musisz podać wartość liczbową z zakresu 0-3");
        sc.nextLine();
      }
    }
  }
}


