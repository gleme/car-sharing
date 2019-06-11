package br.com.caelum.carsharing.user.creation;

import br.com.caelum.carsharing.shared.User;
import java.util.UUID;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
class CreationUserService {

    private final Converter<CreationUserForm, User> converter;
    private final CreationUserRepository repository;

    CreationUserService(Converter<CreationUserForm, User> converter, CreationUserRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    UUID createUserBy(CreationUserForm form) {
        User user = converter.convert(form);

        repository.save(user);

        return user.getId();
    }
}
