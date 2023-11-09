package org.example.scalerAuth.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Session")
public class Session extends BaseModel{

    @ManyToOne
    private User user;
    private String token;

}
