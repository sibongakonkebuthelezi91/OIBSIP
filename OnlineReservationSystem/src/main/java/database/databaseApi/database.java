package database.databaseApi;

import client.clientInfo;
import database.client.clientTable;
import database.repository.Repository;
import io.javalin.http.Context;
import io.javalin.http.HttpStatus;

public class database {

    public static void all(Context ctx){

    }

    public static void User(Context ctx){
        String user = ctx.pathParam("id");
    }


    public static void signUp(Context ctx){
        clientTable information = ctx.bodyAsClass(clientTable.class);
        boolean isRegistered =  Repository.register(information);
        if(isRegistered) {
            ctx.status(HttpStatus.CREATED);
            return;
        }
        ctx.status((HttpStatus.NO_CONTENT));
    }
}
