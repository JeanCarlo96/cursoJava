package com.jcma.springboot.reuniones.services;

import com.jcma.springboot.reuniones.data.IReunionRepository;
import com.jcma.springboot.reuniones.models.Reunion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReunionService {

    private final IReunionRepository iReunionRepository;

    public ReunionService(IReunionRepository iReunionRepository){
        this.iReunionRepository = iReunionRepository;
    }

    public List<Reunion> getAllReuniones(){
        return iReunionRepository.findAll();
    }

    public Optional<Reunion> getById(Long id){
        return iReunionRepository.findById(id);
    }

}
