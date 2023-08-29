package upc.edu.pe.trabajogosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.trabajogosecurity.repositories.PMarcaRepository;
import upc.edu.pe.trabajogosecurity.serviceinterfaces.PMarcaInterfaces;

@Service
public class PMarcaImplements implements PMarcaInterfaces {
    @Autowired
    private PMarcaRepository MarR;
}
