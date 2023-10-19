package dio.domain.model;

import jakarta.persistence.Entity;


@Entity(name = "tb_descricao")
public class Descricao {
    private Integer quarto;
    private Integer suite;
    private Integer vagas;
    private Integer metragem;
    private Boolean mobilia;
    
    public Integer getQuarto(){
        return quarto;
    }
    public void setQuarto(Integer quarto) {
        this.quarto = quarto;
    }

     public Integer getSuite(){
        return suite;
    }
     public void setSuite(Integer suite) {
        this.suite = suite;
    }

     public Integer getVagas(){
        return vagas;
    }
     public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

     public Integer getMetragem(){
        return metragem;
    }
     public void setMetragem(Integer metragem) {
        this.metragem = metragem;
    }

     public Boolean  getMobilia(){
        return mobilia;
    }
     public void setMobilia(Boolean mobilia) {
        this.mobilia = mobilia;
    }
}
