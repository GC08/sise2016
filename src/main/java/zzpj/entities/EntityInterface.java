package zzpj.entities;

import java.util.ArrayList;
import java.util.HashMap;

public interface EntityInterface {

    String update();

    String create();

    String getWith(HashMap columns);

    String getAll();
    
    ArrayList<Entity> readDataFromResult(HashMap result);
}
