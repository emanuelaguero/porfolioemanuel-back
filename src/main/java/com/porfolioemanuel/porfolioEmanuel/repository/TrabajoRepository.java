
package com.porfolioemanuel.porfolioEmanuel.repository;

import com.porfolioemanuel.porfolioEmanuel.model.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajoRepository extends JpaRepository<Trabajo,Long> {
    
}
