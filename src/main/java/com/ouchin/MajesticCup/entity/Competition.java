package com.ouchin.MajesticCup.entity;

import com.ouchin.MajesticCup.entity.enums.CompetitionStatus;
import lombok.Data;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

@Data
@Builder
@Document(collection = "competitions")
public class Competition {
    @Id
    private String id;

    private String name;

    @Builder.Default
    private List<Team> teams = new ArrayList<>();

    private LocalDate startDate;
    private LocalDate endDate;

    @Builder.Default
    private List<Round> rounds = new ArrayList<>();

    private CompetitionStatus status;

    public void addTeam(Team team) {
        teams.add(team);
    }
}