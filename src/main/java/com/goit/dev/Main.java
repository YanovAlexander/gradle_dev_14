package com.goit.dev;

import com.goit.dev.json_parser.JsonParserSample;
import com.google.gson.Gson;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.setName("Leonardo");
        actor.setSurname("Di Caprio");
        actor.setMovies(Collections.emptyList());
        System.out.println(JsonParserSample.toJson(actor));
        //When we change the gson to implementation in the json_parser project next line will not compile!!
        Gson gson = new Gson();
    }
}
