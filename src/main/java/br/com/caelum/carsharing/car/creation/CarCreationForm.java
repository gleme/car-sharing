package br.com.caelum.carsharing.car.creation;

import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

class CarCreationForm {

    @NotBlank
    private String plate;

    @NotBlank
    private String model;

    @NotNull
    private UUID userId;
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;

    public String getPlate() {
        return plate;
    }

    public String getModel() {
        return model;
    }

    public UUID getUserId() {
        return userId;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
