package upc.edu.pe.trabajogosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.trabajogosecurity.repositories.PertenenciasRepository;
import upc.edu.pe.trabajogosecurity.serviceinterfaces.PertenenciasInterfaces;

@Service
public class PertenenciasImplements implements PertenenciasInterfaces {
    @Autowired
    private PertenenciasRepository PR;
}
