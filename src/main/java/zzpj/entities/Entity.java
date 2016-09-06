package zzpj.entities;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Entity implements EntityInterface {

    private Integer id = 0;

    protected void saveEntity() {
        if (this.id != 0) {
            this.createRow();
        } else {
            this.updateRow();
        }
    }

    private void createRow() {
        Em().executeQuery(this.create());
    }

    private void updateRow() {
        Em().executeQuery(this.update());
    }
    
    public static Entity findOneByEntityAndColumns(Entity entity, HashMap columns){
        return findByEntityAndColumns(entity, columns).get(0);
    }

    public static  ArrayList<Entity> findByEntityAndColumns(Entity entity, HashMap columns){
        HashMap result = (HashMap) Em().getFromQuery(entity.getWith(columns));
        return entity.readDataFromResult(result);
    }
    
    private static EntityManager Em(){
        return new EntityManager();
    }
}
