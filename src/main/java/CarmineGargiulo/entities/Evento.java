package CarmineGargiulo.entities;

public class Evento {
    private long id;
    private String name;
    private String dataEvento;
    private String descrizione;
    private TipoEvento tipoEvento;
    private int nrMaxPartecipanti;

    public Evento(String name, String dataEvento, String descrizione, TipoEvento tipoEvento, int nrMaxPartecipanti) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
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
                ", name='" + name + '\'' +
                ", dataEvento='" + dataEvento + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", nrMaxPartecipanti=" + nrMaxPartecipanti +
                '}';
    }
}
