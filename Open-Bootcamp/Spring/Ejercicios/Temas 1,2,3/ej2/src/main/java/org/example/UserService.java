package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService servicio;

    public UserService(NotificationService servicio){
        this.servicio = servicio;
    }
}
