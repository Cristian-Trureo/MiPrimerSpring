package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name="Cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    private String nombre;

    @OneToMany(mappedBy = "curso")
    private List<Alumno> listaAlumnos;
    @ManyToMany(mappedBy = "listaCursos")
    private List<Profesor> listaProfesores;
}