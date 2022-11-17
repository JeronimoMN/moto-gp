package com.umanizales.moto_gp.motogp.model;

import com.umanizales.moto_gp.motogp.model.dto.BikeClasfDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class Clasification {
    private String description;
    private List<BikeClasfDTO> grill;
    private boolean state;
}
