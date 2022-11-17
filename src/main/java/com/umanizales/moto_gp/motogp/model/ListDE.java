package com.umanizales.moto_gp.motogp.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ListDE {
    private NodeDE head;
    private int size;

    public List<Bike> getList() {
        List<Bike> listBikes = new ArrayList<>();
        if (head != null) {
            NodeDE temp = head;
            while (temp != null) {
                listBikes.add(temp.getData());
                temp = temp.getNext();
            }
        }
        return listBikes;
    }

    public void addEnd(Bike bike) {
        if (head == null) {
            head = new NodeDE(bike);
        } else {
            NodeDE temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            NodeDE newNode = new NodeDE(bike);
            temp.setNext(newNode);
            newNode.setPrevious(temp);
        }
        size++;
    }


    //Caso de descalificación
    public void eliminateByNumberBike(String number) {
        if (head != null) {
            NodeDE temp = head;
            if (head.getData().getNumberBike() == number) {
                head = head.getNext();
                size--;
            } else {
                while (temp.getNext().getData().getNumberBike() != number) {
                    temp = temp.getNext();
                    temp.setNext(temp.getNext().getNext());
                    break;
                }
                size--;
            }
        }
    }

    public int selectBike(int i) {
        int count = 1;
        if (head != null) {
            NodeDE temp = head;
            while (count != i) {
                temp.getNext();
                count++;
            }
        }
        return count;
    }
}