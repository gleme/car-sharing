package br.com.caelum.carsharing.car.creation;

import br.com.caelum.carsharing.events.CreatedCarEvent;
import br.com.caelum.carsharing.shared.Car;
import java.util.UUID;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
class CreateCarService {

    private final Converter<CarCreationForm, Car> converter;

    private final CreationCarRepository repository;
    private final ApplicationEventPublisher publisher;

    CreateCarService(Converter<CarCreationForm, Car> converter, CreationCarRepository repository, ApplicationEventPublisher publisher) {
        this.converter = converter;
        this.repository = repository;
        this.publisher = publisher;
    }

    UUID createCarBy(CarCreationForm form) {
        Car car = converter.convert(form);

        repository.save(car);

        publisher.publishEvent(new CreatedCarEvent(car.getId(), car.getModel(), car.getPlate(), car.getLocation(), car.getUserId()));

        return car.getId();
    }
}
