package com.ouchin.MajesticCup.entity;

import com.ouchin.MajesticCup.entity.enums.RoundStatus;
import lombok.Data;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.util.ArrayList;

@Data
@Builder
@Document(collection = "rounds")
public class Round {
    @Id
    private String id;

    private int roundNumber;
    private Competition competition;

    @Builder.Default
    private List<Match> matches = new ArrayList<>();

    private RoundStatus status;
}