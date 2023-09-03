package upc.edu.pe.trabajogosecurity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.trabajogosecurity.entities.Ayuda;
import upc.edu.pe.trabajogosecurity.repositories.AyudaRepository;
import upc.edu.pe.trabajogosecurity.serviceinterfaces.IAyudaService;

import java.util.List;
@Service
public class IAyudaImplemets implements IAyudaService {
    @Autowired
    private AyudaRepository aR;
    @Override
    public void insert(Ayuda ayuda) {
        aR.save(ayuda);
    }

    @Override
    public List<Ayuda> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAyuda) {
        aR.deleteById(idAyuda);
    }

    @Override
    public Ayuda listId(int idAyuda) {
        return aR.findById(idAyuda).orElse(new Ayuda());
    }
}
