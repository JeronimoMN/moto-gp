package com.umanizales.moto_gp.motogp.model;

import com.umanizales.moto_gp.motogp.model.Clasification;
import com.umanizales.moto_gp.motogp.model.ListDE;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Race {
    private Clasification clasification;
    private String state;
    private ListDE listBikes;

    public void ForwardBikes()
    {

    }
}
