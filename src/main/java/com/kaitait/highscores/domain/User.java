package com.kaitait.highscores.domain;

import lombok.Data;

@Data
public class User {
    private final int id;
    private final String firstName;
    private final String lastName;
}
