package com.umanizales.moto_gp.motogp.model;

import lombok.Data;

@Data
public class NodeDE {
    private Bike data;
    private NodeDE previous;
    private NodeDE next;

    public NodeDE(Bike data)
    {
        this.data= data;}
}


