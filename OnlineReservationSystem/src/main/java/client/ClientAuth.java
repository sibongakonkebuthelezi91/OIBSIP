package client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;

public class ClientAuth {

    private clientInfo client;

    public ClientAuth(clientInfo client){
        this.client = client;
    }

    public clientInfo getClient() {
        return client;
    }

    public boolean signUp(){
        String url = "http://localhost:5050/onlinereserevation/signup";
        ObjectMapper map = new ObjectMapper();
        try{
        String json = map.writeValueAsString(client);
            System.out.println(json);
        HttpClient user = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        HttpResponse<String> response = user.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 201 || response.statusCode() != 200){
            System.out.println(response.statusCode());
            return false;
        }
            System.out.println(response.body());
            return true;
        } catch (JsonProcessingException e) {
            System.out.println("could not build Json");
            return false;
        } catch (IOException | InterruptedException e) {
            System.out.println("Could not send request");
            return false;
        }
    }

    public boolean login(){
        return true;
    }

    public boolean passwordIsValid(String password){
        if (password == null || password.length() < 8){
            System.out.println("Password should be atleast 8 characters long");
            return false;
        }
        if (password.matches("\\d+")){
            System.out.println("Password should contain atleast 1 digit");
            return false;
        }
        if ( password.matches("[a-z]+")){
            System.out.println("Password should atleast contain 1 Lowercase character");
            return false;
        }
        if (password.matches("[A-Z]+")){
            System.out.println("Password should atleast contain 1 Uppercase character");
        }
        if(password.matches(".*[@$!%*?&#_-].*")){
            System.out.println("Password should atleast contain 1 special character");
            return false;
        }
        return true;
    }
}
