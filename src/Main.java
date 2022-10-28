public class Main {
    public static void main(String[] args) {

        System.out.println(checkData("dfgrewe", "3r465", "f4erwd"));
        System.out.println(checkData("logon","password","password"));


    }

    public static boolean checkData(String login, String password, String confPassword) {
        try {
            return Data.userData(login, password, confPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка логина" + e.getMessage());
            return false;

        }catch (WrongPasswordException e){
            System.out.println("Ошибка пароля" + e.getMessage());
            return false;
        }


    }
}