package upc.edu.pe.trabajogosecurity.serviceinterfaces;

import upc.edu.pe.trabajogosecurity.entities.PertenenciasColor;

import java.util.List;

public interface PColorInterfaces {
    public void insert(PertenenciasColor pertenenciasColor);
    public List<PertenenciasColor> list();
}
