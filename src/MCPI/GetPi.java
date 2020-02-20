package MCPI;
import java.security.SecureRandom;

public class GetPi {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        double counter = 0;
        double totalPoints = 10000000;
        double ratio = 0;
        double x = 0;
        double y = 0;
        double pi = 0;

        for (int i = 0; i <= totalPoints; i++) {
            x = random.nextDouble();
            y = random.nextDouble();
            if((Math.pow(x, 2) + Math.pow(y, 2)) <= 1){
                counter++;
            }
        }

        ratio = counter / totalPoints;
        pi = ratio * 4;
        System.out.println(pi);

    }
}