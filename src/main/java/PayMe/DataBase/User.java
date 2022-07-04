package PayMe.DataBase;


public class User  {
    private String firstname;
    private String lastName;
    private String phoneNumber;
    private String cardNumber;
    private String cardPassword;
    private double cardBalance=DataBase.cardBalance;

    public User(double cardBalance) {
        this.cardBalance=cardBalance;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public User(String firstname, String lastName, String phoneNumber, String cardNumber, String cardPassword) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
    }

    public User(String firstname, String lastName, String phoneNumber, String cardNumber, String cardPassword, double cardBalance) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.cardBalance = cardBalance;

    }





    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname=" + firstname+"\n" +
                " lastName=" + lastName+"\n"  +
                " phoneNumber=" + phoneNumber+"\n"  +
                " cardNumber= " + cardNumber+"\n"  +
                "Card Balance="+DataBase.cardBalance+'}';
    }
}
