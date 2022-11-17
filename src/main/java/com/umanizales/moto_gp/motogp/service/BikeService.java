package com.umanizales.moto_gp.motogp.service;

import com.umanizales.moto_gp.motogp.model.Bike;
import com.umanizales.moto_gp.motogp.model.NodeDE;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor

public class BikeService {
    private List<Bike> bikes;
    private Bike numberbike;


    private List<Bike> getBikes()
    {
        return bikes;
    }


    //Crear una motocicleta
    private void createBike(Bike bike)
    {
        bike = new Bike("1234", "Blue", false, "Juan");
        bikes.add(bike);
    }



    private void updateDataBike(String id, String col, boolean state, String pilot)
    {
    }
}
