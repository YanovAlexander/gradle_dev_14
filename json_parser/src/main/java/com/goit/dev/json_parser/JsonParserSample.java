package com.goit.dev.json_parser;

import com.google.gson.Gson;

public class JsonParserSample {
    public static String toJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}
