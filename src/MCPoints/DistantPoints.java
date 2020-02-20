package MCPoints;

import java.security.SecureRandom;

public class DistantPoints {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        double sumXY = 0;
        double totalPairs = 100000000;
        double x = 0;
        double y= 0;
        double x2 = 0;
        double y2 = 0;
        double averageDistance = 0;

        for (int i = 0; i <= totalPairs; i++) {
            x = random.nextDouble();
            y = random.nextDouble();
            x2 = random.nextDouble();
            y2 = random.nextDouble();

            sumXY += Math.sqrt((Math.pow(x-y,2)+Math.pow(x2-y2,2)));

        }

        averageDistance = sumXY / totalPairs;
        System.out.println(averageDistance);

    }

}
