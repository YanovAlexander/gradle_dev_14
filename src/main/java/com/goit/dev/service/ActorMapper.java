package main.java.com.goit.dev.service;

import com.google.gson.Gson;
import main.java.com.goit.dev.Actor;

public class ActorMapper {
    public static String toJson(Actor actor) {
        Gson gson = new Gson();
       return gson.toJson(actor);
    }
}
