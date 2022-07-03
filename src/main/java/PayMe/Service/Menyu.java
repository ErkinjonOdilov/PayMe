package PayMe.Service;

import PayMe.DataBase.DataBase;
import PayMe.DataBase.User;
import PayMe.utils.Util;

import java.util.List;
import java.util.Scanner;

import static PayMe.DataBase.DataBase.cardBalance;
import static PayMe.DataBase.DataBase.users;

public class Menyu {
    Scanner scanner = new Scanner(System.in);
    User user = new User();

    void showMenyu() {
        boolean t = true;
        while (!t)
            System.out.println(" ");
        switch (Util.menu(List.of("1->Oplata;\n 2->Balance;\n 3->Perevod;\n 4->Koshlyok;\n 5->Parametr;"))) {
            case "0" -> {
                t = false;
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
                                        if (cardBalance != 0) {
                                            if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                DataBase.cardBalance -= payment;
                                                b = false;
                                            }
                                        } else {
                                            System.out.println("Kartada mablag' Yetarli emas\n" +
                                                    "kartani to'ldirib qayta urinib ko'ring!");
                                            break;
                                        }
                                        if (b) {
                                            System.out.println("Card Passwordi Xato!! ");
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
                                        if (cardBalance != 0) {
                                            if (users.get(i).getCardPassword().equals(cardPassword)) {
                                                DataBase.cardBalance -= payment;
                                                b = false;
                                            }
                                        } else {
                                            System.out.println("Kartada mablag' Yetarli emas\n" +
                                                    "kartani to'ldirib qayta urinib ko'ring!");
                                            break;
                                        }
                                        if (b) {
                                            System.out.println("Card Passwordi Xato!! ");
                                        }
                                    }

                                }
                            }
                        }
                        case "2" -> {
                        }
                        case "3" -> {
                        }
                        case "4" -> {
                        }
                        case "5" -> {
                        }
                        case "6" -> {
                        }
                    }

                }
            }
            case "2" -> {
            }
            case "3" -> {
            }
            case "4" -> {
            }
            case "5" -> {
            }
        }


    }
}
