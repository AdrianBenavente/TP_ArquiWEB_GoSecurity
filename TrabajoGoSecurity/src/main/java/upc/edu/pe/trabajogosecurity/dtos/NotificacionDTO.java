package upc.edu.pe.trabajogosecurity.dtos;

import upc.edu.pe.trabajogosecurity.entities.Ayuda;
import upc.edu.pe.trabajogosecurity.entities.TipoCaso;

public class NotificacionDTO {
    private int idNotificación;
    private Ayuda idAyuda;
    private TipoCaso idTipoCaso;

    public int getIdNotificación() {
        return idNotificación;
    }

    public void setIdNotificación(int idNotificación) {
        this.idNotificación = idNotificación;
    }

    public Ayuda getIdAyuda() {
        return idAyuda;
    }

    public void setIdAyuda(Ayuda idAyuda) {
        this.idAyuda = idAyuda;
    }

    public TipoCaso getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(TipoCaso idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }
}
