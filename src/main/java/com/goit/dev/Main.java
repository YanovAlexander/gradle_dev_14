package main.java.com.goit.dev;

import main.java.com.goit.dev.service.ActorMapper;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.setName("Leonardo");
        actor.setSurname("DiCaprio");
        actor.setMovies(Collections.emptyList());
        System.out.println(ActorMapper.toJson(actor));
    }
}
