package PayMe;

import PayMe.Service.Registration;
import PayMe.utils.Util;

import java.util.List;
import java.util.Scanner;

public class Main {
   public static Registration registration=new Registration();
    public static void main(String[] args) {
boolean g=false;
    while (!g){
        switch (Util.menu(List.of("PayMe","1->Registration","2->Sign In","0->Exit"))){
            case "0"-> {g=true;
                System.out.println("Dasturdan Foydalanganingiz uchun Raxmat!");}
            case "1"-> registration.registration();
            case "2"-> registration.SignIN();

        }

    }
    }
}
