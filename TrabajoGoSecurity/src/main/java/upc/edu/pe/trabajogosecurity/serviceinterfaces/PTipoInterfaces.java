package upc.edu.pe.trabajogosecurity.serviceinterfaces;

import upc.edu.pe.trabajogosecurity.entities.PertenenciasTipo;

import java.util.List;

public interface PTipoInterfaces {
    public void insert(PertenenciasTipo pertenenciasTipo);
    public List<PertenenciasTipo> list();
}
