package com.ouchin.MajesticCup.entity;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerStatistics implements Serializable {
    @Builder.Default
    private int totalGoals = 0;

    @Builder.Default
    private int totalAssists = 0;

    @Builder.Default
    private int yellowCards = 0;

    @Builder.Default
    private int redCards = 0;

    @Builder.Default
    private int matchesPlayed = 0;
}