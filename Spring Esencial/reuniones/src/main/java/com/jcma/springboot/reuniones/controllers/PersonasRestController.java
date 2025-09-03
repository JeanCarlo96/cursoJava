package com.jcma.springboot.reuniones.controllers;

import com.jcma.springboot.reuniones.models.Persona;
import com.jcma.springboot.reuniones.services.PersonaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/personas")
public class PersonasRestController {

    private PersonaService personaService;

    public PersonasRestController(PersonaService personaService){
        this.personaService = personaService;
    }

    @GetMapping
    @Operation(summary = "Recuperar personas", description = "Recupera todas las personas")
    public List<Persona> getAllPersonas(){
        return personaService.getAllPersonas();
    }

    @GetMapping("{id}")
    @Operation(summary = "Recupera una persona", description = "Recupera una persona dado un Id")
    public Persona getPersonaById(
            @PathVariable
            @Parameter(name = "id", description = "Id de la persona que queremos recuperar", example = "1")
            Long id){
        Persona persona = new Persona();
        if(personaService.getById(id).isPresent()){
            persona = personaService.getById(id).get();
        }
        return persona;
    }

    @PostMapping
    public ResponseEntity<Persona> create(@RequestBody Persona persona) {
        Persona savedPersona = personaService.addPersona(persona);
        return ResponseEntity.ok(savedPersona);
    }

}
