package CarmineGargiulo;

import CarmineGargiulo.dao.EventoDao;
import CarmineGargiulo.entities.Evento;
import CarmineGargiulo.entities.TipoEvento;
import CarmineGargiulo.exceptions.NotFoundException;
import com.github.javafaker.Faker;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Application {
    private static final Faker faker = new Faker(Locale.ITALY);
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestione-eventi");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDao eventoDao = new EventoDao(em);
        List<Evento> eventoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TipoEvento tipoRandom = faker.random().nextInt(1, 3) == 1 ? TipoEvento.PUBBLICO : TipoEvento.PRIVATO;
            Evento ev = new Evento(
                    faker.superhero().name(),
                    LocalDate.of(faker.random().nextInt(1993, 2024), faker.random().nextInt(1 , 12), faker.random().nextInt(1, 27)),
                    faker.superhero().descriptor(),
                    tipoRandom, faker.random().nextInt(10000, 60000));
            eventoList.add(ev);
        }
        eventoList.forEach(eventoDao::save);

        try{
            Evento searched = eventoDao.getById(9);
            System.out.println(searched);
            eventoDao.delete(6);
        }catch (NotFoundException e){
            System.out.println(e.getMessage());
        }

        em.close();
        emf.close();
    }
}
