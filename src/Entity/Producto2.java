package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "PRODUCTO2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto2.findAll", query = "SELECT p FROM Producto2 p")
    , @NamedQuery(name = "Producto2.findById", query = "SELECT p FROM Producto2 p WHERE p.id = :id")
    , @NamedQuery(name = "Producto2.findByMarca", query = "SELECT p FROM Producto2 p WHERE p.marca = :marca")
    , @NamedQuery(name = "Producto2.findByModelo", query = "SELECT p FROM Producto2 p WHERE p.modelo = :modelo")
    , @NamedQuery(name = "Producto2.findByColor", query = "SELECT p FROM Producto2 p WHERE p.color = :color")
    , @NamedQuery(name = "Producto2.findByPrecio", query = "SELECT p FROM Producto2 p WHERE p.precio = :precio")
    , @NamedQuery(name = "Producto2.findByCuota", query = "SELECT p FROM Producto2 p WHERE p.cuota = :cuota")})
public class Producto2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "PRECIO")
    private Double precio;
    @Column(name = "CUOTA")
    private Double cuota;

    public Producto2() {
    }

    public Producto2(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getCuota() {
        return cuota;
    }

    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Producto2)) {
            return false;
        }
        Producto2 other = (Producto2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Producto2[ id=" + id + " ]";
    }

}
