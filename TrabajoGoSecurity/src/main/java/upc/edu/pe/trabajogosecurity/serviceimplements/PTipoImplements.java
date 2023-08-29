package upc.edu.pe.trabajogosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.trabajogosecurity.repositories.PTipoRepository;
import upc.edu.pe.trabajogosecurity.serviceinterfaces.PTipoInterfaces;

@Service
public class PTipoImplements implements PTipoInterfaces {
    @Autowired
    private PTipoRepository TR;
}
