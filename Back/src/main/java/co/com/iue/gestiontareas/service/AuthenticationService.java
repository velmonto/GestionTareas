package co.com.iue.gestiontareas.service;

import co.com.iue.gestiontareas.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
