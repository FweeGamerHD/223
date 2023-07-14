package model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
public class Benutzer {

    private String username;
    private String password;
    private String salt;
    private String role;
    }
