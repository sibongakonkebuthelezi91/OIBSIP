package client;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class ClientAuthTest {

    @Test
    void noLowercase(){
        ClientAuth auth = new ClientAuth(new clientInfo("konke", "buthelezi", "sibo@gmail.com", "L1@GHAAE"));


        PrintStream stream = System.out;

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream customStream = new PrintStream(output, true, StandardCharsets.UTF_8);

        try{
            System.setOut(customStream);
            assertFalse(auth.passwordIsValid());
        }finally {
            System.setOut(stream);
        }

        String answer = output.toString(StandardCharsets.UTF_8).toLowerCase();
        assertTrue(answer.contains("lowercase"));
    }

}