package ticket;

import java.util.Random;

public class PnrNumber {

    private static String alphabets = "ABCDEDFGHJKLMNOPQRSTUVWXY";
    private static String numeric = "23456789";


    public static String pnrNumberGenerate(){
        String pnr = "";
        Random random = new Random();
        for(int x = 1; x <= 6; x*=2){
            int indexAlpha = random.nextInt(alphabets.length());
            int indexNumeric = random.nextInt(numeric.length());
            pnr += alphabets.charAt(indexAlpha);
            pnr += numeric.charAt(indexNumeric);
        }
        return pnr;
    }
}
