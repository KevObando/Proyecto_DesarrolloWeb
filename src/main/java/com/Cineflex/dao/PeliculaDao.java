package com.Cineflex.dao;

import com.Cineflex.domain.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaDao extends CrudRepository<Pelicula, Long> {
    
}
