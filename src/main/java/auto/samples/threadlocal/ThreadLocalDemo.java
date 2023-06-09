package auto.samples.threadlocal;

public class ThreadLocalDemo {

    private static ThreadLocal<String> atm = new ThreadLocal<>();


    private ThreadLocalDemo() {
    }


    public static String getMoney(){
        return atm.get();
    }


    public static void depositMoney(String money){
        atm.set(money);
    }

    public static void closeAccount(){
        atm.remove();
    }
}
