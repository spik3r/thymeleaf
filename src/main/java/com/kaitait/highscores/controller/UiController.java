package com.kaitait.highscores.controller;

import com.kaitait.highscores.service.HighscoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kai on 8/3/18.
 */
@Controller
public class UiController {

    private final HighscoreService service;

    public UiController(HighscoreService service) {
        this.service = service;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("highscores", service.getAllHighscores());

        return "index";
    }
}
