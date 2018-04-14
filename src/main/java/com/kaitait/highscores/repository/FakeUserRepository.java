package com.kaitait.highscores.repository;

import com.kaitait.highscores.domain.User;

import java.util.HashMap;
import java.util.Map;

public class FakeUserRepository {
    private static Map<Integer, User> users;
    private static int id = 0;
    private static int userId = 0;

    static int nextId() {
        return id++;
    }

    static int nextUserId() {
        return userId++;
    }

    static {


        users = new HashMap<Integer, User>() {
            {
                put(nextId(), new User(nextUserId(), "Jack", "Daniels"));
                put(nextId(), new User(nextUserId(), "Johnny", "Walker"));
                put(nextId(), new User(nextUserId(), "Jim", "Beam"));
            }
        };
    }

    public void createUser(final User user) {
        users.put(nextId(), user);
    }
}
