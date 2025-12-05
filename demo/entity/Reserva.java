package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name= "reservas")

public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
     //Cada columna tiene su propio atributo
         @Column(name="id")
         private Long id;

        @Column(name="fecha")
         private LocalDate fecha;

         @Column(name="hora_Inicio")
         private LocalTime horaInicio;

         @Column(name="hora_fin")
         private LocalTime horaFin;

         @Column(name="aula_id")
         private Integer aulaId;

    //Hago el constructor
    public Reserva(Long id,LocalDate fecha,LocalTime horaInicio,LocalTime horaFin,Integer aulaId){
        this.id=id;
        this.fecha=fecha;
        this.horaInicio=horaInicio;
        this.horaFin=horaFin;
        this.aulaId=aulaId;
    }

    //Hago los getters y setters de cada atributo

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public LocalDate getFecha(){
        return fecha;
    }
    public void setFecha(LocalDate fecha){
        this.fecha=fecha;
    }

    public LocalTime horaInicio(){
        return horaInicio;
    }
    public void setHoraInicio(LocalTime horaInicio){
        this.horaInicio=horaInicio;
    }

    public LocalTime horaFin(){
        return horaFin;
    }
    public void setHoraFin(LocalTime horaFin){
        this.horaFin=horaFin;
    }

    public Integer aulaId(){
        return aulaId;
    }
    public void setAulaId(Integer aulaId){
        this.aulaId=aulaId;
    }



    // añadir mínimo 3 atributos (ejemplo: fecha, horaInicio, horaFin, aulaId)
    // TODO: constructor con parámetros

}
