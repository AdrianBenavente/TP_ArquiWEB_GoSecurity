package upc.edu.pe.trabajogosecurity.serviceinterfaces;

import upc.edu.pe.trabajogosecurity.entities.Pertenencias;

import java.util.List;

public interface PertenenciasInterfaces {
    public void insert(Pertenencias pertenencias);
    public List<Pertenencias> list();
}
