package br.com.caelum.carsharing.maps.addCar;

import br.com.caelum.carsharing.events.CreatedCarEvent;
import br.com.caelum.carsharing.shared.GeoCar;
import org.springframework.context.event.EventListener;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class AddCarListener {

    private final AddCarRepository repository;
    private final Converter<CreatedCarEvent, GeoCar> converter;

    AddCarListener(AddCarRepository repository, Converter<CreatedCarEvent, GeoCar> converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @EventListener
    void handle(CreatedCarEvent event) {
        GeoCar geoCar = converter.convert(event);

        repository.save(geoCar);
    }
}
