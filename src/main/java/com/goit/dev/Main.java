package com.goit.dev;

import com.goit.dev.service.ActorMapper;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.setName("Leonardo");
        actor.setSurname("Di Caprio");
        actor.setMovies(Collections.emptyList());
        System.out.println(ActorMapper.toJson(actor));
    }
}
