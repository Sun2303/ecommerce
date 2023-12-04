package baymax.sky.eCommerce.enities;

import lombok.Getter;

@Getter

public enum Role {
    ADMIN("admin@example.com","123456");
    private String emailAddress;
    private String password;
    Role(String email, String password){
        this.emailAddress = email;
        this.password = password;
    }
}
