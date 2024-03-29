package com.Cineflex.service;

import com.Cineflex.domain.Pelicula;
import java.util.List;

public interface PeliculaService {

    public List<Pelicula> getPeliculas();
    
    public Pelicula getPelicula(Pelicula pelicula);
    
    public void save(Pelicula pelicula);
    
    public void delete(Pelicula pelicula);
}
