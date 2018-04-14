package com.kaitait.highscores.repository;

import com.kaitait.highscores.domain.Highscore;
import com.kaitait.highscores.domain.ImmutableHighscore;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by kai on 7/3/18.
 */
@Repository
public class FakeHighScoreRepository {

    private static Map<Integer, Highscore> highscores;
    private static int id = 0;

    static int nextId() {
        return id++;
    }

    static {


        highscores = new HashMap<Integer, Highscore>(){
            {

//                put(2, new Highscore(1, 999, new Date(System.currentTimeMillis() -15000)));
//                put(1, new Highscore(1, 555, new Date(System.currentTimeMillis() -5000)));
//                put(3, new Highscore(2, 666, new Date(System.currentTimeMillis())));
//                put(4, new Highscore(3, 123, new Date(System.currentTimeMillis() - 1000)));
//                put(5, new Highscore(666, 666, new Date()));

                put(1, ImmutableHighscore.builder()
                        .id(nextId())
                        .userId(1)
                        .score(555)
                        .date(new Date(System.currentTimeMillis() -5000))
                        .build());
                put(2, ImmutableHighscore.builder()
                        .id(nextId())
                        .userId(2)
                        .score(666)
                        .date(new Date(System.currentTimeMillis()))
                        .build());
                put(3, ImmutableHighscore.builder()
                        .id(nextId())
                        .userId(3)
                        .score(123)
                        .date(new Date(System.currentTimeMillis() - 1000))
                        .build());
                put(4, ImmutableHighscore.builder()
                        .id(nextId())
                        .userId(1)
                        .score(999)
                        .date(new Date(System.currentTimeMillis() - 10000))
                        .build());
                put(5, ImmutableHighscore.builder()
                        .id(nextId())
                        .userId(666)
                        .score(666)
                        .date(new Date(System.currentTimeMillis() - 3000))
                        .build());
            }
        };
    }

    public Collection<Highscore> getAllHighscores() {
        return this.highscores.values();
    }

    public Highscore getHighscoreById(int highscoreId) {
        return highscores.get(highscoreId);
    }

    public Collection<Highscore> getHighscoreByUserId(int userId) {
        final List<Highscore> highscoreList = new ArrayList<>();
        for (Highscore highscore: highscores.values()) {
            if (highscore.getUserId() == userId) {
                highscoreList.add(highscore);
            }
        }
        return highscoreList;
    }

    public void addHighscore(Highscore highscore) {
        highscores.put(highscores.size() + 1, highscore);
    }

}
