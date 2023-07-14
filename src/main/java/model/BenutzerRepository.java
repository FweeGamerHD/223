package model;

public interface BenutzerRepository {
    static void save(Benutzer u1) {
    }

    Benutzer[] findAll();
}
