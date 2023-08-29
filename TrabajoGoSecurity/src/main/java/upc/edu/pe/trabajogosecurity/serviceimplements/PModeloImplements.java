package upc.edu.pe.trabajogosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.trabajogosecurity.repositories.PModeloRepository;
import upc.edu.pe.trabajogosecurity.serviceinterfaces.PModeloInterfaces;

@Service
public class PModeloImplements implements PModeloInterfaces {
    @Autowired
    private PModeloRepository ModR;
}
