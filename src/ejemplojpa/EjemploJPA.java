package ejemplojpa;

import Entity.Producto2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EjemploJPA {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EjemploJPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        //Insertando un Producto a la tabla producto2
        Producto2 producto = new Producto2();
        producto.setId(213);
        producto.setMarca("FORD");
        producto.setModelo("RANGER 4X4");
        producto.setColor("BLANCO OXFORD");
        producto.setPrecio(6685000.0);
        producto.setCuota(68850.0);
        em.persist(producto);

        et.commit();
        
    }

}
