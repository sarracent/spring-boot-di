package com.sarracent.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")cuando quieres inyectar tus propias clases
public class MiServicioComplejo implements IServicio {

    @Override
    public String operacion() {
        return "ejecutando algo complejo...";
    }
}
