package com.kaitait.highscores.service;

import com.kaitait.highscores.domain.Highscore;
import com.kaitait.highscores.repository.FakeHighScoreRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Created by kai on 7/3/18.
 */
@Service
public class HighscoreService {

    @Inject
    private final FakeHighScoreRepository repository;

    public HighscoreService(FakeHighScoreRepository repository) {
        this.repository = repository;
    }

    public Collection<Highscore> getAllHighscores() {
        return repository.getAllHighscores();
    }

    public Highscore getHighscoreById(int highscoreId) {
        return repository.getHighscoreById(highscoreId);
    }

    public Collection<Highscore> getHighscoreUserId(int userId) {
        return repository.getHighscoreByUserId(userId);
    }

    public void addHighscore(Highscore highscore) {
        repository.addHighscore(highscore);
    }
}
