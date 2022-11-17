package com.umanizales.moto_gp.motogp.service;

import com.umanizales.moto_gp.motogp.model.Clasification;
import com.umanizales.moto_gp.motogp.model.Race;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class RaceService {
    private List<Race> races;
    private List<Clasification> clasifications;
    private BikeService bikeService;
}
