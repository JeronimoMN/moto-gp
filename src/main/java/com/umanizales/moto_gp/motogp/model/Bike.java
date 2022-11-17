package com.umanizales.moto_gp.motogp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Bike
{
    private String numberBike;
    private String color;
    private boolean state;
    private String pilot;
}
