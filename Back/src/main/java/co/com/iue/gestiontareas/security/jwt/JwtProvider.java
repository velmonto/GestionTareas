package co.com.iue.gestiontareas.security.jwt;


import co.com.iue.gestiontareas.model.User;
import co.com.iue.gestiontareas.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {
    String generateToken(UserPrincipal auth);


    String generateToken(User user);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
