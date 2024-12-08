package com.ouchin.MajesticCup.entity;

import lombok.Data;
import lombok.Builder;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

@Data
@Builder
public class MatchResult implements Serializable {
    @Builder.Default
    private int homeTeamGoals = 0;

    @Builder.Default
    private int awayTeamGoals = 0;

    @Builder.Default
    private List<PlayerMatchStatistics> playerStatistics = new ArrayList<>();

    public MatchResult() {
    }
}