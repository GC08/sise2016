package zzpj.entities;

import java.sql.ResultSet;
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

    public static Entity findOneByEntityAndColumns(Entity entity, HashMap columns) {
        if (findByEntityAndColumns(entity, columns).size() > 0) {
            return findByEntityAndColumns(entity, columns).get(0);
        }
        
        return null;
    }

    public static ArrayList<Entity> findByEntityAndColumns(Entity entity, HashMap columns) {
        ResultSet result = Em().getFromQuery(entity.getWithQuery(columns));

        return entity.readDataFromResult(result);
    }

    public static ArrayList<Entity> findByEntityAndColumns(Entity entity) {
        ResultSet result = Em().getFromQuery(entity.getAllQuery());

        return entity.readDataFromResult(result);
    }

    private static EntityManager Em() {
        return new EntityManager();
    }

    protected String getWithQuery(HashMap columns) {
        String select = "SELECT ";
        String where = " WHERE ";
        String from = " FROM " + this.getTableName();

        for (Object key : columns.keySet()) {
            String columnName = (String) key;
            String value = (String) columns.get(key);
            select += columnName;
            where += columnName + " = '" + value + "' ";
        }

        return select + from + where + ";";
    }

    String getAllQuery() {
        String select = "SELECT * ";
        String from = " FROM " + this.getTableName();

        return select + from + ";";
    }
}
