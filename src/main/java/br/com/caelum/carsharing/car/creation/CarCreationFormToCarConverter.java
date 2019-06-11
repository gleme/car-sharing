package br.com.caelum.carsharing.car.creation;

import br.com.caelum.carsharing.shared.Car;
import br.com.caelum.carsharing.shared.Location;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class CarCreationFormToCarConverter implements Converter<CarCreationForm, Car> {

    @Override
    public Car convert(CarCreationForm source) {
        Location location = new Location(source.getLatitude(), source.getLongitude());

        return new Car(source.getPlate(), source.getModel(), location, source.getUserId());
    }
}
