package ticket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PnrNumberTest {

    @Test
    void generatePNR(){
        String pnr = PnrNumber.pnrNumberGenerate();
        assertInstanceOf(String.class, pnr);
    }

}