package org.example.scalerAuth.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "User")
public class User extends BaseModel{
    private String Username;
    private String email;
    private String password;
}
