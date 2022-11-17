package com.umanizales.moto_gp.motogp.service;

import com.umanizales.moto_gp.motogp.model.Rol;
import com.umanizales.moto_gp.motogp.model.User;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class UserService
{
    private List<Rol> rols;
    private List<User> users;


    public List<Rol> getRols() {
        return rols;
    }

    public List<User> getUsers() {
        return users;
    }

    //public void AddRol()
    //{
    //    if(head != null);
    //}
}
