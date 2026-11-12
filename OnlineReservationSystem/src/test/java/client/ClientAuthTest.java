package client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class ClientAuthTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    void setUp(){
        PrintStream customStream = new PrintStream(output, true, StandardCharsets.UTF_8);
            System.setOut(customStream);

    }

    @AfterEach
    void breakIt(){
        System.setOut(System.out);
    }

    @Test
    void lessCharacters(){
        ClientAuth auth = new ClientAuth(new clientInfo("konke", "buthelezi", "sibo@gmail.com", "L1@GHE"));
        assertFalse(auth.passwordIsValid());
        String answer = output.toString(StandardCharsets.UTF_8).toLowerCase();
        assertTrue(answer.contains("8"), "does not detect lower case");
    }

    @Test
    void noLowercase(){
        ClientAuth auth = new ClientAuth(new clientInfo("konke", "buthelezi", "sibo@gmail.com", "L1@GHAAE"));
        assertFalse(auth.passwordIsValid());
        String answer = output.toString(StandardCharsets.UTF_8).toLowerCase();
        assertTrue(answer.contains("lowercase"), "does not detect lower case");
    }

    @Test
    void noUppercase(){
        ClientAuth auth = new ClientAuth(new clientInfo("konke",
                "buthelezi",
                "sibo@gmail.com",
                "l1@fgahr"));
        assertFalse(auth.passwordIsValid());
        String answer = output.toString(StandardCharsets.UTF_8).toLowerCase();
        assertTrue(answer.contains("uppercase"), "does not detect lower case");
    }

}