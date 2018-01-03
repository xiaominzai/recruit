package units;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Security implements Encryption{
    private static final String SITE_WIDE_SECRET = "beibei";
    private static final PasswordEncoder encoder = new StandardPasswordEncoder(SITE_WIDE_SECRET);

    public  String encrypt(String rawPassword) {
        return encoder.encode(rawPassword);
    }

    public  boolean match(String rawPassword, String password) {
        return encoder.matches(rawPassword, password);
    }
}
