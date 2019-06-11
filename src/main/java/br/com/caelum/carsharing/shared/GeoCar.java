package br.com.caelum.carsharing.shared;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GeoCar {

    @Id
    @Column(columnDefinition = "binary(16)")
    private UUID id;
    private String model;
    private String plate;
    private Location location;

    @Deprecated
    private GeoCar() {
    }

    public GeoCar(UUID id, String model, String plate, Location location) {
        this.id = id;
        this.model = model;
        this.plate = plate;
        this.location = location;
    }

    public UUID getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public Location getLocation() {
        return location;
    }
}
