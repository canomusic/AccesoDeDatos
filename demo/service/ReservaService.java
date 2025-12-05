// Cambiar una reserva.

package com.example.demo.service;
//importo lo necesario para este service (spring,repository y entity)
import com.example.demo.entity.Reserva;
import com.example.repository.ReservaRepository;
import com.springframework.stereotype.Service;

import java.util.List;

@Service   // Indica que esta clase es un servicio de Spring
public interface ReservaService {

private final ReservaRepository repo;

//Aquí inyecto las dependencias
public ReservaService (ReservaRepository repo){
    this.repo=repo;
}

// Recoge todas las reservas.
public List<Reserva> findAll(){
    return repo.findAll();
}

// Guardar una reserva 
  public Reserva save(Reserva reserva) {
        return repo.save(reserva);
    }


// Recoge una reserva.
public List<Reserva> find(){
    return repo.find();
}


// Borrar una reserva por id
public void delete(Long id){
    repo.deleteById(id);
}


















}
