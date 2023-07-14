package model;

import java.util.Optional;

public interface BuchungRepository {
    void save(Buchung t1);

    Buchung[] findAll();

    Optional<Object> findById(long l);
}
