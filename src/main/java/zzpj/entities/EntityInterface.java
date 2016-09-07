package zzpj.entities;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface EntityInterface {

    String update();

    String create();
    
    ArrayList<Entity> readDataFromResult(ResultSet result);
    
    String getTableName();
}
