/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8.transversal.g2.clases;

/**
 *
 * @author luciano.echevarne
 */
public class Cursada {
    
    private int id_cursada;
    private Alumno alumno;
    private Materia materia;
    private int nota;

    public Cursada() {
    }
    public Cursada(int id_cursada, Alumno alumno, Materia materia, int nota) {
        this.id_cursada = id_cursada;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
    public Cursada(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getId_cursada() {
        return id_cursada;
    }
    public Alumno getAlumno() {
        return alumno;
    }
    public Materia getMateria() {
        return materia;
    }
    public int getNota() {
        return nota;
    }
    
    public void setId_cursada(int id_cursada) {
        this.id_cursada = id_cursada;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
