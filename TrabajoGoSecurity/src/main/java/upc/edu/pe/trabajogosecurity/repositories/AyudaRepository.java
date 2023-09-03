package upc.edu.pe.trabajogosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.trabajogosecurity.entities.Ayuda;

@Repository
public interface AyudaRepository extends JpaRepository<Ayuda, Integer> {
}
