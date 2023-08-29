package upc.edu.pe.trabajogosecurity.serviceinterfaces;

import upc.edu.pe.trabajogosecurity.entities.PertenenciasMarca;

import java.util.List;

public interface PMarcaInterfaces {
    public void insert(PertenenciasMarca pertenenciasMarca);
    public List<PertenenciasMarca> lisdt();
}
