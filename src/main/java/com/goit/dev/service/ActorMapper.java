package com.goit.dev.service;

import com.goit.dev.Actor;
import com.google.gson.Gson;

public class ActorMapper {
    public static String toJson(Actor actor) {
        Gson gson = new Gson();
       return gson.toJson(actor);
    }
}
