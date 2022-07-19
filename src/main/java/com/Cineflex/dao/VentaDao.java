package com.Cineflex.dao;

import com.Cineflex.domain.Venta;
import org.springframework.data.repository.CrudRepository;

public interface VentaDao extends CrudRepository<Venta, Long> {
    
}
