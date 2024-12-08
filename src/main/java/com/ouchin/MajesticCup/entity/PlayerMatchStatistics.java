package com.ouchin.MajesticCup.entity;

import lombok.Data;
import lombok.Builder;
import java.io.Serializable;

@Data
@Builder
public class PlayerMatchStatistics implements Serializable {
    private Player player;

    @Builder.Default
    private int goals = 0;

    @Builder.Default
    private int assists = 0;

    @Builder.Default
    private int yellowCards = 0;

    @Builder.Default
    private int redCards = 0;
}
