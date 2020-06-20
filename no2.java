public class no2 {
    public static void main(String[] args) {
        //    password harus 8 karakter
        //    password minimal ada huruf besar,kecil, angka, karakter spesial

        System.out.println(password("1qaz2wsX!"));
        System.out.println(password("1qaz2wsx!"));
    }

    public static boolean password(String password) {

        boolean passw = false;
        boolean isAtLeast8 = password.length() < 8;
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasNumber = password.matches( ".*[0-9].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*].*");

        if (isAtLeast8) {
            return passw;
        } else {
            if (hasLowercase && hasUppercase && hasNumber && hasSpecial ){
                passw = true;
            }
        }
        return passw;
    }
}