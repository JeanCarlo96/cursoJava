package com.jcma.springboot.reuniones.services;

import com.jcma.springboot.reuniones.data.IPersonaRepository;
import com.jcma.springboot.reuniones.models.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    private final IPersonaRepository iPersonaRepository;

    public PersonaService(IPersonaRepository iPersonaRepository){
        this.iPersonaRepository = iPersonaRepository;
    }

    public List<Persona> getAllPersonas(){
        return iPersonaRepository.findAll();
    }

    public Optional<Persona> getById(Long id){
        return iPersonaRepository.findById(id);
    }

    public Persona addPersona(Persona persona){
        return iPersonaRepository.save(persona);
    }

}
