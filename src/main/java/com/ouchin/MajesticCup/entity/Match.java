package com.ouchin.MajesticCup.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@Document(collection = "matches")
public class Match {
    @Id
    private String id;

    private Team homeTeam;
    private Team awayTeam;

    private LocalDateTime matchDate;

    @Builder.Default
    private MatchResult result = new MatchResult();

    private Team winner;
    private Round round;
}
