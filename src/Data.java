import java.util.Objects;

public class Data {

    public static boolean userData(String login, String password, String confirmPassword) {

        boolean loginValid = isLengthData(login, 20, 1) && isSymbolData(login);

        if (!loginValid) {
            throw new WrongLoginException(" не правильный логин");
        }
        boolean passwordValid = isLengthData(password, 20, 1) && isSymbolData(password)
                && Objects.equals(password, confirmPassword);
        if (!passwordValid) {
            throw new WrongPasswordException(" не правильный пароль");
        }
        return true;
    }


    public static boolean isLengthData(String value, int max, int min) {
        if (value == null) {
            return false;
        }
        int length = value.length();
        return length >= min && length <= max;
    }

    public static boolean isSymbolData(String value) {
        if (value == null) {
            return false;
        }
        for (char c : value.toCharArray()) {
            boolean symbolMatches = ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ||
                    (Character.isDigit(c)) || (c == '_'));
            if (!symbolMatches) {
                return false;
            }
        }
        return true;
    }
}
