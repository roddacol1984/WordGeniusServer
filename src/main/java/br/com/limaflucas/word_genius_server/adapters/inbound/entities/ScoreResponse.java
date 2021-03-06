package br.com.limaflucas.word_genius_server.adapters.inbound.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;
import java.util.UUID;

@Data
@AllArgsConstructor
public class ScoreResponse {

    private UUID playerID;
    private BigInteger score;
}
