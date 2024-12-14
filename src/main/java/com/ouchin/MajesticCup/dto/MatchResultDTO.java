package com.ouchin.MajesticCup.dto;

import lombok.Data;

@Data
public class MatchResultDTO {
    private String id;
    private String team1Name;
    private String team2Name;
    private int team1Goals;
    private int team2Goals;
    private String winnerName;
}

