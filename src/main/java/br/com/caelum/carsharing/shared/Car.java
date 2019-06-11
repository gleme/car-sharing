package br.com.caelum.carsharing.shared;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Car {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "binary(16)")
    private UUID id;

    private String plate;
    private String model;

    @Embedded
    private Location location;

    @Column(columnDefinition = "binary(16)")
    private UUID userId;

    @Deprecated
    private Car() {
    }

    public Car(String plate, String model,Location location, UUID userId) {
        this.plate = plate;
        this.model = model;
        this.location = location;
        this.userId = userId;
    }

    public UUID getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public String getModel() {
        return model;
    }

    public UUID getUserId() {
        return userId;
    }

    public Location getLocation() {
        return location;
    }
}
