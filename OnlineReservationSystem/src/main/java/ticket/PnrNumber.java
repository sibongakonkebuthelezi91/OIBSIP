package ticket;

import java.util.Random;

public class PnrNumber {

    private static String alphabets = "ABCDEDFGHJKLMNOPQRSTUVWXY";
    private static String numeric = "23456789";


    public static String pnrNumberGenerate(){
        String pnr = "";
        Random random = new Random();
        for(int x = 0; x <= 6; x++){
            int indexAlpha = random.nextInt(alphabets.length());
            int indexNumeric = random.nextInt(numeric.length());
            pnr += alphabets.charAt(indexAlpha) + numeric.charAt(indexNumeric);
        }

        return pnr;
    }
}
