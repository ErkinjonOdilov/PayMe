package PayMe.DataBase;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class cardTransfer {
    private String myCard;
    private String anotherCard;
    private double transfrerBalance;

    public cardTransfer(String myCard, String anotherCard, double transfrerBalance) {
        this.myCard = myCard;
        this.anotherCard = anotherCard;
        this.transfrerBalance = transfrerBalance;
    }
}
