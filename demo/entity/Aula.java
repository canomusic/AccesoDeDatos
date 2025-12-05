package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name= "aula")
public class Aula {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    //Cada columna tiene su propio atributo
@Column(name = "id")
 private Long id;

@Column(name = "nombre")
 private String nombre;

@Column(name = "capacidad")
 private Integer capacidad;

@Column(name = "edificio")
 private String edificio;



    //Hago el constructor
    public Aula(Long id,String nombre,Integer capacidad,String edificio){
        this.id=id;
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.edificio=edificio;
    }
    //Hago los getters y setters de cada atributo
   public long getId(){
    return id;
   }
   
   public void setId(long id){
    this.id=id;
   }
   
    public String getNombre(){
    return nombre;
   }
   
   public void setNombre(String nombre){
    this.nombre=nombre;
   }
   
    public Integer getCapacidad(){
    return capacidad;
   }
   
   public void setCapacidad(Integer capacidad){
    this.capacidad=capacidad;
   }
   
    public String getEdificio(){
    return edificio;
   }
   
   public void setEdificio(String edificio){
    this.edificio=edificio;
   }
   
   
   
   
   
    // añadir mínimo 3 atributos (ejemplo: nombre, capacidad, edificio)

  
}
