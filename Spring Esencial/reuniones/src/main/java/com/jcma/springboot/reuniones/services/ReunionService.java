package com.jcma.springboot.reuniones.services;

import com.jcma.springboot.reuniones.data.IReunionRepository;
import com.jcma.springboot.reuniones.models.Persona;
import com.jcma.springboot.reuniones.models.Reunion;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReunionService {

    private final IReunionRepository iReunionRepository;

    public ReunionService(IReunionRepository iReunionRepository){
        this.iReunionRepository = iReunionRepository;
    }

    public List<Reunion> getAllReuniones(){
        return iReunionRepository.findAll();
    }

}
