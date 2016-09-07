package zzpj.entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public interface EntityInterface {

    String update();

    String create();
    
    ArrayList<Entity> readDataFromResult(ResultSet result);
    
    String getTableName();
}
