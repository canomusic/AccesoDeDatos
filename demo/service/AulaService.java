package com.example.demo.service;

//falta importar lo que une el repository y además lo del spring
import com.example.demo.entity.Aula;
import com.example.repository.AulaRepository;
import com.springframework.stereotype.Service;

import java.util.List;

@Service   // Indica que esta clase es un servicio de Spring
public interface AulaService {

private final AulaRepository repo;

//Aquí inyecto las dependencias
public AulaService (AulaRepository repo){
    this.repo=repo;
}

// Recoge todas las aulas.
public List<Aula> findAll(){
    return repo.findAll();
}

// Guardar un aula 
  public Aula save(Aula aula) {
        return repo.save(aula);
    }


// Recoge un aula.
public List<Aula> find(){
    return repo.find();
}

// Borrar un aula por id
public void delete(Long id){
    repo.deleteById(id);
}
// Cambiar un aula.







}
