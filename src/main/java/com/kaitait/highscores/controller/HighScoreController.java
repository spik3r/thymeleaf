package com.kaitait.highscores.controller;

import com.kaitait.highscores.domain.Highscore;
import com.kaitait.highscores.service.HighscoreService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Created by kai on 7/3/18.
 */
@RestController
@RequestMapping("api/highscores")
public class HighScoreController {

    @Inject
    private final HighscoreService service;

    public HighScoreController(HighscoreService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Collection<Highscore> getAllHighscores() {
        return service.getAllHighscores();
    }

    @RequestMapping(value = "/{highscoreId}", method = RequestMethod.GET)
    public Highscore getHighscoreByHighscoreId(@PathVariable int highscoreId) {
        return service.getHighscoreById(highscoreId);
    }

    @RequestMapping(value = "/{highscore}", method = RequestMethod.POST)
    public void addHighscore(@RequestBody Highscore highscore) {
        service.addHighscore(highscore);
    }

    @RequestMapping(value = "/{userId}/highscores", method = RequestMethod.GET)
    public Collection<Highscore> getHighscoreByUserId(@PathVariable int userId) {
        return service.getHighscoreUserId(userId);
    }
}
