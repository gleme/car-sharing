package br.com.caelum.carsharing.maps.addCar;

import br.com.caelum.carsharing.events.CreatedCarEvent;
import br.com.caelum.carsharing.shared.GeoCar;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class CreatedCarEventToGeoCarConverter implements Converter<CreatedCarEvent, GeoCar> {

    @Override
    public GeoCar convert(CreatedCarEvent source) {
        return new GeoCar(source.getId(), source.getModel(), source.getPlate(), source.getLocation());
    }
}
