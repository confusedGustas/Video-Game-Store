package com.gustas.videogamestore.service.session;

import com.gustas.videogamestore.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface SessionService {

    Long getIdFromSession();
    User getUserFromSessionId();

}
