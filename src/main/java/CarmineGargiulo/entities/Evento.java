package CarmineGargiulo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title" , nullable = false)
    private String titolo;

    @Column(name = "event_date", nullable = false)
    private LocalDate dataEvento;

    @Column(name = "description")
    private String descrizione;

    @Column(name = "event_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;

    @Column(name = "max_participants")
    private int nrMaxPartecipanti;

    public Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int nrMaxPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.nrMaxPartecipanti = nrMaxPartecipanti;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNrMaxPartecipanti() {
        return nrMaxPartecipanti;
    }

    public void setNrMaxPartecipanti(int nrMaxPartecipanti) {
        this.nrMaxPartecipanti = nrMaxPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", name='" + titolo + '\'' +
                ", dataEvento='" + dataEvento.toString() + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", nrMaxPartecipanti=" + nrMaxPartecipanti +
                '}';
    }
}
