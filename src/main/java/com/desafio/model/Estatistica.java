package com.desafio.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Estatistica {
    private double sum;
    private double avg;
    private double max;
    private double min;
    private long count;
}
