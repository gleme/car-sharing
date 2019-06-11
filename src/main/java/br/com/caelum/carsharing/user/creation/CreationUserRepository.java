package br.com.caelum.carsharing.user.creation;

import br.com.caelum.carsharing.shared.User;
import java.util.UUID;
import org.springframework.data.repository.Repository;

interface CreationUserRepository extends Repository<User, UUID> {

    void save(User user);
}
