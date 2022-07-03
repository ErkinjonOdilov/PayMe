package PayMe;

import PayMe.Service.Registration;
import PayMe.utils.Util;

import java.util.List;
import java.util.Scanner;

public class Main {
   public static Registration registration=new Registration();
    public static void main(String[] args) {

    while (true){
        switch (Util.menu(List.of("Welcome","1->Registration","2->Sign In","0->Exit"))){
            case "1"-> registration.registration();
            case "2"-> registration.SignIN();

        }

    }
    }
}
