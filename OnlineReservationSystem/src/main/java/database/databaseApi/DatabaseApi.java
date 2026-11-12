package database.databaseApi;

import database.repository.Repository;
import io.javalin.Javalin;
import io.javalin.http.*;

public class DatabaseApi {
    public static void main(String[] args){
    Javalin app = Javalin.create().start(5050);
    app.post("/onlinereserevation/signup", database::signUp);

    }
}
