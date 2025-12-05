  //importo la utilidad del spring,el controller al paquete,el service y el entitiy
package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Aula;
import com.example.service.AulaService;


import java.util.List;

@RestController
@RequestMapping("/api/Aula")
public class AulaController {

    private final AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

  // Devolver todas las aulas
  @GetMapping
    public List<Aula> getAll() {
        return service.findAll();
    }
  // Devolver un aula por id
   @GetMapping("/{id}")
    public Aula getOne(@PathVariable Long id) {
        return service.findById(id);
    }


  // añadir aula -- no se debe repetir
  // modificar aula

  // borrar aula por id
  @DeleteMapping ("/{id}")
  public void delete(@PathVariable Long id){service.delete(id);}
}
