package upc.edu.pe.trabajogosecurity.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Policia")
public class Policia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPolicia;
    
    private int nPlaca;
    private String fotoRostro;
    private String fotoIdentidad;
    private int rangoP;
}
