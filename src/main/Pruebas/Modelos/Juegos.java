package Modelos;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Juegos {
    private Integer id;
    private String nombre;
    private String descExtendida;
    private String descBreve;
    private Date fechaCreacion;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "descExtendida", nullable = true, length = 1000)
    public String getDescExtendida() {
        return descExtendida;
    }

    public void setDescExtendida(String descExtendida) {
        this.descExtendida = descExtendida;
    }

    @Basic
    @Column(name = "descBreve", nullable = true, length = 200)
    public String getDescBreve() {
        return descBreve;
    }

    public void setDescBreve(String descBreve) {
        this.descBreve = descBreve;
    }

    @Basic
    @Column(name = "fechaCreacion", nullable = false)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juegos juegos = (Juegos) o;
        return Objects.equals(id, juegos.id) &&
                Objects.equals(nombre, juegos.nombre) &&
                Objects.equals(descExtendida, juegos.descExtendida) &&
                Objects.equals(descBreve, juegos.descBreve) &&
                Objects.equals(fechaCreacion, juegos.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descExtendida, descBreve, fechaCreacion);
    }
}
