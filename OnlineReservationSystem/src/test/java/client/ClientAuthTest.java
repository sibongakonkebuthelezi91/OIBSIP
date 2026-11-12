package client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientAuthTest {

    @Test
    void noLowercase(){
        ClientAuth auth = new ClientAuth(new clientInfo("konke", "buthelezi", "sibo@gmail.com", "L1@GHAAE"));
        assertFalse(auth.passwordIsValid());
    }

}