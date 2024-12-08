package com.ouchin.MajesticCup.entity;

import lombok.Data;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.util.ArrayList;

@Data
@Builder
@Document(collection = "teams")
public class Team {
    @Id
    private String id;

    private String name;
    private String city;

    @Builder.Default
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }
}
