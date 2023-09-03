package upc.edu.pe.trabajogosecurity.serviceinterfaces;

import upc.edu.pe.trabajogosecurity.entities.Ayuda;

import java.util.List;

public interface IAyudaService{
    public void insert(Ayuda ayuda);
    public List<Ayuda> list();
    public void delete(int idAyuda);
    public Ayuda listId(int idAyuda);

}
