package com.kaitait.highscores.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Date;

/**
 * Created by kai on 7/3/18.
 */
@Value.Immutable
@JsonSerialize(as = ImmutableHighscore.class)
@JsonDeserialize(as = ImmutableHighscore.class)
public abstract class Highscore {
    public abstract int getId();
    public abstract int getUserId();
    public abstract int getScore();
    public abstract Date getDate();
}
