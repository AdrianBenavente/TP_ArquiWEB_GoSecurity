package upc.edu.pe.trabajogosecurity.serviceinterfaces;

import upc.edu.pe.trabajogosecurity.entities.TipoCaso;

import java.util.List;

public interface ITipoCasoService {
    public void insert(TipoCaso tipoCaso);
    public List<TipoCaso> list();
    public void delete(int idTipoCaso);
    public TipoCaso lisId(int idTipoCaso);
}
