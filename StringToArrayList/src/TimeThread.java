import java.text.SimpleDateFormat;
import java.util.Random;

public class TimeThread {


    static Random rn = new Random();
    private static Token token = new Token();

    public static void main(String[] args) {
        token.setValue("111111");
        System.out.println("Starting to count");

        checkTimePassed();

//        for (int i=0; i<3; i++){
//            run();
//        }
//        System.out.println("Stop the delay");
    }


    public static boolean checkTimePassed() {


        boolean retValue = false;
        long currentMillis = System.currentTimeMillis();
        long millisToEndProccess = currentMillis + 1500;

        while (!retValue) {
            if (currentMillis == millisToEndProccess) {
                retValue = true;
                System.out.println("1500 millis passed");
            } else {
                currentMillis = System.currentTimeMillis();
            }
        }
        return retValue;

    }


    private static void run() {
        currentTime = System.currentTimeMillis();
        System.out.println("Token : " + token.getValue());

        System.out.println("Retrieving new Token");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int intToken = rn.nextInt();
        token.setValue(String.valueOf(intToken));
    }


    static long currentTime = System.currentTimeMillis();


}
