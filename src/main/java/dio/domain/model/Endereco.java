package dio.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_endereco")
public class Endereco {
    private Long bairro;
    private Long cidade;

    public Long getBairro(){
        return bairro;
    }
    public void setBairro(Long bairro){
        this.bairro = bairro;
    }
    
    public Long getCidade(){
        return cidade;
    }
    public void setCidade (Long cidade) {
        this.cidade = cidade;
    }
}
