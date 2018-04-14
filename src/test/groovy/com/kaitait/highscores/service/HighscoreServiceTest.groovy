package com.kaitait.highscores.service

import com.kaitait.highscores.domain.Highscore
import com.kaitait.highscores.repository.FakeHighScoreRepository
import spock.lang.Specification
import spock.lang.Subject

/**
 * Created by kai on 8/3/18.
 */
class HighscoreServiceTest extends Specification {

    @Subject HighscoreService service

    FakeHighScoreRepository repository = Mock()


    def setup() {
        service = new HighscoreService(repository)
    }


    def "GetAllHighscores"() {
        when:
        service.getAllHighscores()

        then:
        1 * repository.getAllHighscores()
    }

    def "GetHighscoreById"() {
        when:
        service.getHighscoreById(666)

        then:
        1 * repository.getHighscoreById(666)
    }

    def "GetHighscoreUserId"() {
        when:
        service.getHighscoreUserId(123)

        then:
        1 * repository.getHighscoreByUserId(123)
    }

    def "calling add highscore results in service call with the same highscore"() {
        given:
        Highscore highscore = Mock()

        when:
        service.addHighscore(highscore)

        then:
        1 * repository.addHighscore(highscore)
    }
}
