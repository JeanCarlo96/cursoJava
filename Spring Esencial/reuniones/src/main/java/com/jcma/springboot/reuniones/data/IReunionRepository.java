package com.jcma.springboot.reuniones.data;

import com.jcma.springboot.reuniones.models.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "reuniones")
public interface IReunionRepository extends JpaRepository<Reunion, Long> {
}
