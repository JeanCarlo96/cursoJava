package com.jcma.springboot.reuniones.data;

import com.jcma.springboot.reuniones.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
