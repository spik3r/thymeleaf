package com.kaitait.highscores.controller

import com.kaitait.highscores.domain.Highscore
import com.kaitait.highscores.service.HighscoreService
import spock.lang.Specification
import spock.lang.Subject
/**
 * Created by kai on 8/3/18.
 */
class HighScoreControllerTest extends Specification {

    @Subject HighScoreController controller

    HighscoreService service = Mock()


    def setup() {
        controller = new HighScoreController(service)
    }
    def "GetAllHighscores"() {
        when:
        controller.getAllHighscores()

        then:
        1 * service.getAllHighscores()
    }

    def "GetHighscoreByHighscoreId"() {
        when:
        controller.getHighscoreByHighscoreId(1)

        then:
        1 * service.getHighscoreById(1)
    }

    def "AddHighscore"() {
        given:
        Highscore highscore = Mock()

        when:
        controller.addHighscore(highscore)

        then:
        1 * service.addHighscore(highscore)
    }

    def "GetHighscoreByUserId"() {
        when:
        controller.getHighscoreByUserId(666)

        then:
        1 * service.getHighscoreUserId(666)
    }
}
