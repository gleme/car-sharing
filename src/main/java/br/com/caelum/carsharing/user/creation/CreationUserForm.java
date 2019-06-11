package br.com.caelum.carsharing.user.creation;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

class CreationUserForm {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    /**
     * @deprecated frameworks only
     */
    @Deprecated
    private CreationUserForm() {
    }

    public CreationUserForm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
