package upc.edu.pe.trabajogosecurity.serviceinterfaces;

import upc.edu.pe.trabajogosecurity.entities.PertenenciasModelo;

import java.util.List;

public interface PModeloInterfaces {
    public void Insert(PertenenciasModelo pertenenciasModelo);
    public List<PertenenciasModelo> list();
}
