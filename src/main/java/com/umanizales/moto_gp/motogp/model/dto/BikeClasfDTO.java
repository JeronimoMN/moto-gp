package com.umanizales.moto_gp.motogp.model.dto;

import com.umanizales.moto_gp.motogp.model.Bike;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class BikeClasfDTO {
    private Bike bike;
    private float time;
}
