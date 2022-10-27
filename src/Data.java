public class Data {

    private Data() {}
    private static final String VALID_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            return false;
        }
        return true;
    }

    private static void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!validate(login)) {
            throw new WrongLoginException("Логин не валидный!");
        }
        if (!validate(password)) {
            throw new WrongPasswordException("Пароль не валидный!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать!");
        }

    }

    private static boolean validate(String s) {
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
