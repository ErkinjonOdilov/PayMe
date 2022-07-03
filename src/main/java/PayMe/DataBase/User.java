package PayMe.DataBase;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User  {
    private String firstname;
    private String lastName;
    private String phoneNumber;
    private String cardNumber;
    private String cardPassword;


}
