package PayMe.Service;

import PayMe.DataBase.User;
import PayMe.utils.Reader;

import java.util.Scanner;

import static PayMe.DataBase.DataBase.*;

public class Registration implements Methods {
    Scanner scanner = new Scanner(System.in);
 public User u2=new User(cardBalance);
    @Override
    public void registration() {
            System.out.print("First Name: ");
            String firstName = scanner.next();
            System.out.print("Last Name: ");
            String lastName = scanner.next();
            System.out.print("Phone Number: ");
            String phoneNumber = scanner.next();
            System.out.print("Card Number: ");
            String cardNumber = scanner.next();
            System.out.print("Card Password: ");
            String cardPassword = scanner.next();
            User u1 = new User(firstName, lastName, phoneNumber, cardNumber, cardPassword);
            users.add(u1);
        }



    @Override
    public void SignIN() {

            String cardNumber = Reader.readLine("Card Number: ");
            System.out.print("Card Passwprd: ");
            String cardPassword = scanner.next();
            boolean f = true;
            for (int i = 0; i < users.getSize(); i++) {
                if (users.get(i).getCardNumber().equals(cardNumber) && users.get(i).getCardPassword().equals(cardPassword)) {
                    Menyu menyu = new Menyu();
                    menyu.showMenyu();
                    f=false;
                }
            }
            if(f){
                System.out.println("Bazada bunday foydalanuvchi yo'q!!");
            }
        }



    @Override
    public void fillBalance(){
        System.out.println(" Fill My Balance");
        System.out.print("How Mach $ to Filled: ");
        double fillBalance = scanner.nextDouble();
        System.out.print("Card Number: ");
        String cardNumber = scanner.next();
        System.out.print("Card Password: ");
        String cardPassword = scanner.next();
        for (int i = 0; i < users.size; i++) {
            if(users.get(i).getCardNumber().equals(cardNumber)&&users.get(i).getCardPassword().equals(cardPassword)){
                cardBalance = cardBalance+fillBalance;
            }
        }
        User u1 = new User(cardBalance);
        System.out.println("Muaffaqiyatli to'ldirildi");
        }


    @Override
    public void transferBalance() {

    }
    public void History(){
        System.out.print("Card Password: ");
        String cardPassword = scanner.next();
        for (int i = 0; i < users.size; i++) {
            if(users.get(i).getCardPassword().equals(cardPassword)) {
                for (int j = 0; j < history.size; j++) {
                    System.out.println(history.get(i) + " ");
                }
            }
        }
    }
}