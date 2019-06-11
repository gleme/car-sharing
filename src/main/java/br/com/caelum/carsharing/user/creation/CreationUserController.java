package br.com.caelum.carsharing.user.creation;

import static org.springframework.http.ResponseEntity.created;

import java.net.URI;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("users")
class CreationUserController {

    private final CreationUserService service;

    CreationUserController(CreationUserService service) {
        this.service = service;
    }

    @PostMapping
    ResponseEntity<?> create(@Valid @RequestBody CreationUserForm form, UriComponentsBuilder uriBuilder) {
        UUID userId = service.createUserBy(form);

        URI uri = uriBuilder.path("/users/{id}").build(userId);

        return created(uri).build();
    }

}
