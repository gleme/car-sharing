package br.com.caelum.carsharing.user.creation;

import br.com.caelum.carsharing.shared.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class CreationUserFormToUserConverter implements Converter<CreationUserForm, User> {

    @Override
    public User convert(CreationUserForm source) {
        return new User(source.getEmail(), source.getPassword());
    }
}
