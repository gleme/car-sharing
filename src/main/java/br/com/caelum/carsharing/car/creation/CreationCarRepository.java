package br.com.caelum.carsharing.car.creation;

import br.com.caelum.carsharing.shared.Car;
import java.util.UUID;
import org.springframework.data.repository.Repository;

interface CreationCarRepository extends Repository<Car, UUID> {

    void save(Car car);
}
