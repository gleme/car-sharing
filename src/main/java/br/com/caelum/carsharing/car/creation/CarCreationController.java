package br.com.caelum.carsharing.car.creation;

import static org.springframework.http.ResponseEntity.created;

import java.net.URI;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("cars")
class CarCreationController {

    private final CreateCarService service;

    CarCreationController(CreateCarService service) {
        this.service = service;
    }

    ResponseEntity<?> create(@Valid @RequestBody CarCreationForm form, UriComponentsBuilder uriBuilder) {

        UUID carId = service.createCarBy(form);

        URI uri = uriBuilder.path("/cars/{id}").build(carId);

        return created(uri).build();

    }
}
