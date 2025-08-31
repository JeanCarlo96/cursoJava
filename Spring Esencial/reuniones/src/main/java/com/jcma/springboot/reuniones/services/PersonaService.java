package com.jcma.springboot.reuniones.services;

import com.jcma.springboot.reuniones.data.IPersonaRepository;
import com.jcma.springboot.reuniones.models.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final IPersonaRepository iPersonaRepository;

    public PersonaService(IPersonaRepository iPersonaRepository){
        this.iPersonaRepository = iPersonaRepository;
    }

    public List<Persona> getAllPersonas(){
        return iPersonaRepository.findAll();
    }

}
