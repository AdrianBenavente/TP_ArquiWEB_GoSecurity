package upc.edu.pe.trabajogosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.trabajogosecurity.dtos.AyudaDTO;
import upc.edu.pe.trabajogosecurity.entities.Ayuda;
import upc.edu.pe.trabajogosecurity.serviceinterfaces.IAyudaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ayuda")
public class AyudaControllers {
    @Autowired
    private IAyudaService aS;
    @PostMapping
    public void Registrar(@RequestBody AyudaDTO dto){
        ModelMapper m= new ModelMapper();
        Ayuda p=m.map(dto, Ayuda.class);
        aS.insert(p);
    }
    @GetMapping
    public List<AyudaDTO> list() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AyudaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public AyudaDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        AyudaDTO dto = m.map(aS.listId(id), AyudaDTO.class);
        return dto;
    }
}