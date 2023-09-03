package upc.edu.pe.trabajogosecurity.serviceinterfaces;

import upc.edu.pe.trabajogosecurity.entities.Notificacion;

import java.util.List;

public interface INotificacionService {
    public void insert(Notificacion notificacion);
    public List<Notificacion> list();
    public void delete(int idNotificacion);
    public Notificacion listId(int idNotificacion);
}
