package com.ouchin.MajesticCup.dto;

import lombok.Data;

@Data
public class PlayerStatisticsDTO {
    private String id;
    private String playerName;
    private String teamName;
    private int goals;
    private int assists;
    private int yellowCards;
    private int redCards;
}
