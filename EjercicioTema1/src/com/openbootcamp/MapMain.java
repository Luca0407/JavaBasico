package com.openbootcamp;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();
        personas.put("12345678H", "Nombre Apellido 1");
        personas.put("12345678L", "Nombre Apellido 2");
        personas.put("12345678P", "Nombre Apellido 3");

        System.out.println(personas);

        for(String key : personas.keySet()) {
            System.out.println(key);
        }

        for(String value : personas.values()) {
            System.out.println(value);
        }

        for(Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }
    }

    public static void Mappa() {
        Map<String, String> people = new HashMap<>();
        people.put("12345678H", "Name Surname 1");
        people.put("12345678L", "Name Surname 2");
        people.put("12345678P", "Name Surname 3");

        System.out.println(people);

        for(String key : people.keySet()) {
            System.out.println(key);
        }

        for(String value : people.values()) {
            System.out.println(value);
        }

        for(Map.Entry<String, String> pair : people.entrySet()) {
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }
    }
}
