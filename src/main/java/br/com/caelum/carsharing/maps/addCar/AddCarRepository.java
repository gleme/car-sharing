package br.com.caelum.carsharing.maps.addCar;

import br.com.caelum.carsharing.shared.GeoCar;
import java.util.UUID;
import org.springframework.data.repository.Repository;

interface AddCarRepository extends Repository<GeoCar, UUID> {

    void save(GeoCar geoCar);
}
