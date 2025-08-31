package com.jcma.springboot.reuniones.data;

import com.jcma.springboot.reuniones.models.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReunionRepository extends JpaRepository<Reunion, Long> {
}
