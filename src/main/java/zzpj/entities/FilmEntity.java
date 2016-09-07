package zzpj.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilmEntity extends Entity {

    private Integer id;
    private String title;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String update() {
        String setUpdate = "UPDATE " + this.getTableName() + " SET " + "title = " + this.title;

        if (this.description != null) {
            setUpdate += " description = " + this.description;
        }

        setUpdate += " WHERE id = " + this.id + " ;";

        return setUpdate;
    }

    @Override
    public String create() {
        String insert = "INSERT INTO " + this.getTableName();
        String columns = " (title";
        String values = "VALUES (" + this.title;

        if (this.description != null) {
            columns += ", description;";
            values += ", " + this.description;
        }

        columns += ") ";
        values += ");";

        return insert + columns + values;
    }

    @Override
    public ArrayList readDataFromResult(ResultSet result) {
        ArrayList<FilmEntity> films = new ArrayList<>();

        try {
            while (result.next()) {
                FilmEntity film = new FilmEntity();
                film.setId(result.getInt("id"));
                film.setTitle(result.getString("title"));

                if (result.getString("description") != null) {
                    film.setDescription(result.getString("description"));
                }

                films.add(film);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FilmEntity.class.getName()).log(Level.SEVERE, null, ex);
        }

        return films;
    }

    @Override
    public String getTableName() {
        return "film";
    }

}
