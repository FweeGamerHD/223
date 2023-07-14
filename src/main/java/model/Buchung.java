package model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
public class Buchung {

    private Benutzer benutzer;
    private CoworkingSpace coworkingSpace;
}
