package zzpj.entities;

import java.util.Date;

public class UserEntity implements Entity {

    private Integer id;
    private Date birthdate;
    private boolean sex;
    private String firstName;
    private String lastName;
    private String email;

    @Override
    public void update() {
        if (this.id == null) {
            this.create();
        }
    }

    @Override
    public void create() {
        
    }

}
