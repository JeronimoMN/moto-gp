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

    public void ForwardBikes(SelectBike selectBike, int position)
    {
        if(head != null)
        {
            NodeDE temp= head;
            while (temp != selectBike)
            {
                temp= temp.getNext();
            }
            if(position == listBikes)
            {
                temp.setNext(temp.getNext());
                temp.setNext(temp.getPrevious());
            }
        }
    }

    public void LostPosition()
    {
        NodeDE temp= head;
        while (temp != selectBike)
        {
            temp= temp.getNext();
        }
        if(position == listBikes)
        {
            temp.setNext(temp.getNext());
            temp.setNext(temp.getPrevious());
        }
    }
    }

    public ListDE getListBikes() {
        return listBikes;
    }

    public Clasification getClasification() {
        return clasification;
    }

    public void getClasi()
    {
    }
}
