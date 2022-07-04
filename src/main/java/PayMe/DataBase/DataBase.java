package PayMe.DataBase;

public class DataBase {
    public static Informations  <User>  users=new Informations<>();
    public static Informations <History> history=new Informations<>();
    public static double cardBalance=0;


    public DataBase(double cardBalance) {
        this.cardBalance=cardBalance;
    }
    public void showBalance(){
        System.out.println(cardBalance);
    }
}
