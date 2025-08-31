package com.jcma.springboot.reuniones.data;

import com.jcma.springboot.reuniones.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "personas")
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
