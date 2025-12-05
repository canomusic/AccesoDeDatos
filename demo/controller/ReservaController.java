  //importo la utilidad del spring,el controller al paquete,el service y el entitiy
package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Reserva;
import com.example.service.ReservaService;


import java.util.List;

@RestController
@RequestMapping("/api/Reserva")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

  // Devolver todas las reservas
  @GetMapping
    public List<Reserva> getAll() {
        return service.findAll();
    }
  // Devolver una reserva por id
   @GetMapping("/{id}")
    public Reserva getOne(@PathVariable Long id) {
        return service.findById(id);
    }


  // añadir reserva -- no se debe repetir
  // modificar reserva

  // borrar reserva por id
  @DeleteMapping ("/{id}")
  public void delete(@PathVariable Long id){service.delete(id);}
}
