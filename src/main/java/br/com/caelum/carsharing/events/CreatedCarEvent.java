package br.com.caelum.carsharing.events;

import br.com.caelum.carsharing.shared.Location;
import java.util.UUID;
import org.springframework.context.ApplicationEvent;

public class CreatedCarEvent {

    private final UUID id;
    private final String model;
    private final String plate;
    private final Location location;
    private final UUID userId;

    public CreatedCarEvent(UUID id, String model, String plate, Location location, UUID userId) {
        this.id = id;
        this.model = model;
        this.plate = plate;
        this.location = location;
        this.userId = userId;
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

    public UUID getUserId() {
        return userId;
    }
}
