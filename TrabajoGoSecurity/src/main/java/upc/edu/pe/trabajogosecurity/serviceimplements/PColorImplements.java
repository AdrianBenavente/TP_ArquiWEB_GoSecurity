package upc.edu.pe.trabajogosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.trabajogosecurity.repositories.PColorRepository;
import upc.edu.pe.trabajogosecurity.serviceinterfaces.PColorInterfaces;

@Service
public class PColorImplements implements PColorInterfaces {
    @Autowired
    private PColorRepository CR;
}
