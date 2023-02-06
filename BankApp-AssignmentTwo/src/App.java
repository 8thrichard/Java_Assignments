public class App {
    public static void main(String[] args) throws Exception {
            Account richardAccount = new Account();
            Account johnAccount = new Account(1000.10, "John", "Owen");


            System.out.println(richardAccount.number);
            System.out.println(johnAccount.number);
    }
}
