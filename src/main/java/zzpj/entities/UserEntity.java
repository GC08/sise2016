package zzpj.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class UserEntity extends Entity {

    private Integer id;
    private Date birthdate;
    private boolean sex;
    private String firstName;
    private String lastName;
    private String email;

    @Override
    public String getWith(HashMap columns) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Entity> readDataFromResult(HashMap result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
