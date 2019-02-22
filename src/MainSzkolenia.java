//import model.Course;
import controller.RodzajeSzkolenController;
import model.RodzajeSzkolen;

import java.util.Arrays;

public class MainSzkolenia {

    public static void main(String[] args) {




        RodzajeSzkolenController rsc=new RodzajeSzkolenController();
        rsc.addRodzajeSzkolen("Przetargi w budownictwie");
        rsc.addRodzajeSzkolen("Programowanie Fortran");
        rsc.addRodzajeSzkolen("Swing i Tango");
        rsc.addRodzajeSzkolen("Dzierganie na czas");
        System.out.println();
        rsc.getAllRodzajeSzkolen();


    }
}
