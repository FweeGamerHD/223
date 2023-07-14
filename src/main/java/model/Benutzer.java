package model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Setter
@Getter
public class Benutzer {

    private String username;
    private String password;
    private String salt;
    private String role;
    }
