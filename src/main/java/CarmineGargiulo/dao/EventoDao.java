package CarmineGargiulo.dao;

import CarmineGargiulo.entities.Evento;
import CarmineGargiulo.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDao {
    private final EntityManager entityManager;

    public EventoDao(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public void save(Evento evento){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(evento);
        transaction.commit();
        System.out.println("L'evento " + evento.getTitolo() + " è stato salvato correttamente");
    }

    public Evento getById(long id){
        Evento found = entityManager.find(Evento.class, id);
        if(found == null) throw new NotFoundException(id);
        return found;
    }
}
