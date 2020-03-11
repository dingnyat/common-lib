package dingnyat.common.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class PasswordUtils {

    public static String generateRandomPassword(int length) {
        char[] chars =
                {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                        '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.',
                        '/', ':', ';', '<', '=', '>', '?', '@', '^', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~'};
        try {
            Random random = SecureRandom.getInstanceStrong();
            StringBuilder stringBuilder = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                stringBuilder.append(chars[random.nextInt(chars.length)]);
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Couldn't generate random password!");
        }
        return null;
    }
}
