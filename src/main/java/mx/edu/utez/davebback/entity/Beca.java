package mx.edu.utez.davebback.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

import mx.edu.utez.davebback.validator.DescriptionFormat;
import mx.edu.utez.davebback.validator.NameFormat;
import mx.edu.utez.davebback.validator.ParagraphFormat;

public class Beca {
    
    private long id;

    @NotBlank
    @NotNull
    @DescriptionFormat
    private String nombre;

    @NotBlank
    @NotNull
    @ParagraphFormat
    private String descripcion;

    @NotNull
    @Max(10000)
    @NumberFormat(pattern = "#####.##")
    private double monto;

    @NotBlank
    @NotNull
    @NameFormat
    private String periodo;

    @NotBlank
    @NotNull
    @NameFormat
    private String institucion;

    public Beca() {
    }

    public Beca(long id, String nombre, String descripcion, double monto, String periodo, String institucion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.monto = monto;
        this.periodo = periodo;
        this.institucion = institucion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }    
}

