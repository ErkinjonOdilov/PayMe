package PayMe.Service;

import PayMe.DataBase.DataBase;
import PayMe.DataBase.History;
import PayMe.DataBase.Informations;
import PayMe.DataBase.User;
import PayMe.utils.Util;

import java.util.List;
import java.util.Scanner;

import static PayMe.DataBase.DataBase.*;

public class Menyu {
    Scanner scanner = new Scanner(System.in);
    User user = new User(cardBalance);
    public boolean q = false;

    void showMenyu() {
        do {
            boolean t = true;
            while (!t)
                System.out.println(" ");
            switch (Util.menu(List.of("1->Oplata;\n 2->Balance;\n 3->Perevod;\n 4->Koshlyok;\n 5->Parametr;\n 0->Exit"))) {
                case "0" -> {
                    t = false;
                    q = true;
                }
                case "1" -> {
                    boolean c = true;
                    while (c) {
                        System.out.println(" ");
                        switch (Util.menu(List.of("1->Mobil.svyaz;\n 2->Internet;\n 3->Web-Sayt;\n 4->TV i Telefon;\n 5->Kommunal;\n " +
                                "6->Gos.Plateji i GAI;\n 0->Chiqish;"))) {
                            case "0" -> {
                                c = false;
                            }
                            case "1" -> {
                                System.out.print("O'z Telefon raqamingizga\n" +
                                        "pul o'tqazmoqchi bo'lsangiz\n" +
                                        "1 ni kiriting Boshqa telefonga\n" +
                                        "bo'lsa 0 ni kiriting:");
                                int n = scanner.nextInt();
                                switch (n) {
                                    case 0 -> {
                                        System.out.print("Phone Number: ");
                                        String number = scanner.next();
                                        System.out.print("O'tkazma Miqdori: ");
                                        double payment = scanner.nextDouble();
                                        System.out.print("Card password: ");
                                        String cardPassword = scanner.next();
                                        boolean b = true;
                                        for (int i = 0; i < users.getSize(); i++) {
                                            if (cardBalance > 0 && cardBalance > payment) {
                                                if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                    DataBase.cardBalance -= payment;
                                                    b = false;
                                                    System.out.println("Muaffaqiyatli o'tqazildi");
                                                } else if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }

                                            } else {
                                                System.out.println("Kartada mablag' Yetarli emas\n" +
                                                        "kartani to'ldirib qayta urinib ko'ring!");
                                                break;
                                            }


                                        }

                                    }
                                    case 1 -> {
                                        System.out.print("O'tkazma Miqdori: ");
                                        double payment = scanner.nextDouble();
                                        System.out.print("Card password: ");
                                        String cardPassword = scanner.next();
                                        boolean b = true;
                                        for (int i = 0; i < users.getSize(); i++) {
                                            if (cardBalance != 0 && cardBalance > payment) {
                                                if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                    DataBase.cardBalance -= payment;
                                                    b = false;
                                                    System.out.println("Muaffaqiyatli o'tqazildi");
                                                }
                                            } else {
                                                System.out.println("Kartada mablag' Yetarli emas\n" +
                                                        "kartani to'ldirib qayta urinib ko'ring!");
                                                break;
                                            }
                                            History history1 = new History(cardBalance, "+998944109435", payment);
                                            DataBase.history.add(history1);
                                            if (b) {
                                                System.out.println("Card Passwordi Xato!! ");
                                            }
                                        }

                                    }
                                }
                            }
                            case "2" -> {
                                boolean a = true;
                                while (a) {
                                    System.out.println(" ");
                                    switch (Util.menu(List.of("1->Sharq Telekom;\n 2->Sarkor Telekom;\n 3->TPS;\n 4->Comnet;\n 5->UzOnline;\n " +
                                            "6->EVO;\n 0->Chiqish;"))) {
                                        case "0" -> {
                                            a = false;
                                        }
                                        case "1" -> {
                                            System.out.print("WIfi Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }
                                        case "2" -> {
                                            System.out.print("SarKor Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }
                                        case "3" -> {
                                            System.out.print("TSP Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }
                                        case "4" -> {
                                            System.out.print("Comet Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }
                                        case "5" -> {
                                            System.out.print("UZonline Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }
                                        case "6" -> {
                                            System.out.print("EVOS Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }
                                    }
                                }
                            }
                            case "3" -> {
                                boolean d = true;
                                while (d) {
                                    System.out.println(" ");
                                    switch (Util.menu(List.of("1->OLX.UZ;\n 2->Elbozor;\n 3->Ali Express;\n 4->Artel;\n 0->Chiqish;"))) {
                                        case "0" -> {
                                            d = false;
                                        }
                                        case "1" -> {
                                            System.out.print("Xaridor OLX Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }
                                        case "2" -> {
                                            System.out.print("Xaridor Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }
                                        case "3" -> {
                                            System.out.print("Xaridor Kartasi Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }

                                    }
                                }
                            }
                            case "4" -> {
                                boolean q = true;
                                while (q) {
                                    System.out.println(" ");
                                    switch (Util.menu(List.of("1->UZDTV;\n 2->Central Telegraph;\n 3->SMATRCOM;\n 4->Telecom TV;\n 0->Chiqish;"))) {
                                        case "0" -> {
                                            q = false;
                                        }
                                        case "1" -> {
                                            System.out.print("TV Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }
                                    }
                                }
                            }
                            case "5" -> {
                                boolean e = true;
                                while (e) {
                                    System.out.println(" ");
                                    switch (Util.menu(List.of("1->Elektr Energiya;\n 2->Axlat;\n 3->Suv;\n 4->Gaz;\n 0->Chiqish;"))) {
                                        case "0" -> {
                                            e = false;
                                        }
                                        case "1" -> {
                                            System.out.print("Elektr Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }

                                        }
                                        case "2" -> {
                                            System.out.print("Axlat Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            case "6" -> {
                                boolean v = true;
                                while (v) {
                                    System.out.println(" ");
                                    switch (Util.menu(List.of("1->ShtrafiGSBDD(GAI;\n 2->Biopasport;\n 3->Zagranpasport;\n 4->Notarius;\n 0->Chiqish;"))) {
                                        case "0" -> {
                                            v = false;
                                        }
                                        case "1" -> {
                                            System.out.print("Shtraf Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }
                                        }
                                        case "2" -> {
                                            System.out.print("Bank Id Raqamini kiriting:");
                                            String num = scanner.next();
                                            System.out.print("Summani kiriting: ");
                                            double sum = scanner.nextDouble();
                                            System.out.print("Card password: ");
                                            String cardPassword = scanner.next();
                                            boolean b = true;
                                            for (int i = 0; i < users.getSize(); i++) {
                                                if (cardBalance > 0 && cardBalance > sum) {
                                                    if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                        DataBase.cardBalance -= sum;
                                                        b = false;
                                                        System.out.println("Muaffaqiyatli o'tqazildi!!");
                                                    }
                                                } else {
                                                    System.out.println("Kartada mablag' Yetarli emas\n" +
                                                            "kartani to'ldirib qayta urinib ko'ring!");

                                                }
                                                History history1 = new History(cardBalance, num, sum);
                                                DataBase.history.add(history1);
                                                if (b) {
                                                    System.out.println("Card Passwordi Xato!! ");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                 }

                case "2" -> {
                    boolean k=false;
                    while (!k){
                        switch (Util.menu(List.of("Balance Informations","1->About Me","2->Other Cards","0->Exit"))){
                            case "0"-> k=true;
                            case "1"-> {  System.out.print("Card Password: ");
                                String password = scanner.next();
                                boolean l=false;
                                for (int i = 0; i < users.size; i++) {
                                    if (users.get(i).getCardPassword().equals(password)){
                                        System.out.println("Show Balance");
                                        for (int j = 0; j < users.size ; j++) {
                                            System.out.println(users.get(i));
                                            System.out.println("Balance=" + cardBalance);
                                            l=true;
                                            break;
                                        }
                                    }
                                    }if(!l){
                                    System.out.println("Password no'to'g'ri qaytadan urinib ko'ring!!");
                                }
                            }
                            case "2"-> {
                                boolean u=true;
                                System.out.print("Card Password: ");
                                String password = scanner.next();
                                for (int i = 0; i < users.size; i++) {
                                    if (users.get(i).getCardPassword().equals(password)){
                                        for (int j = 0; j < users.size ; j++) {
                                            System.out.println(users.get(i));
                                            System.out.println("Balance=" + cardBalance);
                                            u=false;
                                        }
                                    }
                                    if(u){
                                        System.out.println("Password no'to'g'ri qaytadan urinib ko'ring!!");

                                    }else {
                                        System.out.println();
                                    }

                                }
                            }

                        }

                    }


                }
                case "3" -> {
                    Registration r1=new Registration();
                    boolean g=false;
                    while (!g){
                        switch (Util.menu(List.of("Perevod $","1->Fill Balance","2->Transver Balance","0->Exit"))){
                            case "0"-> g=true;
                            case "1"-> r1.fillBalance();
                            case "2"-> r1.transferBalance();
                        }

                    }
                }
                case "4" -> {}
                case "5" -> {
                    Registration r1=new Registration();
                    Informations e1=new Informations();
                    boolean g=false;
                    while (!g){
                        switch (Util.menu(List.of("Parametr","1->History","2->Remove Cards","0->Exit"))){
                            case "0"-> {g=true;
                                System.out.println("Dasturdan Foydalanganingiz uchun Raxmat!");}
                            case "1"-> r1.History();
                            case "2"-> {
                                System.out.print("O'chirmoqchi bo'lgan Card Number: ");
                                String cardNumber=scanner.next();
                                System.out.print("Card Password: ");
                                String password=scanner.next();
                                for (Integer i = 0; i < users.size; i++) {
                                    if(users.get(i).getCardNumber().equals(cardNumber)&& users.get(i).getCardPassword().equals(password)){
                                        e1.remove(users.get(i));
                                        break;
                                    }else {
                                        System.out.println("Bazada Bunday Carta yo'q");
                                    }
                                }
                            }

                        }

                    }
                }
                default -> {
                    System.out.println("Bunday bo'lim yo'q");
                }
            }
        } while (q != true);
    }
}