package com.ouchin.MajesticCup.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@Document(collection = "players")
public class Player {
    @Id
    private String id;

    private String name;
    private String surname;
    private String position;
    private int number;
    private LocalDate birthDate;

    @Builder.Default
    private PlayerStatistics statistics = new PlayerStatistics();
}
