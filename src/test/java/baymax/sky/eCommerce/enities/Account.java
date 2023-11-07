package baymax.sky.eCommerce.enities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Account {
    private String emailAddress;
    private String passWord;
}
