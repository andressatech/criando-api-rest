package dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "tb_preco")
public class Valor {

    @Column(scale = 2, precision = 13)
    private BigDecimal preco;

    public BigDecimal getPreco(){
    return preco;
    }

    public void setPreco(BigDecimal preco){
        this.preco =preco;
    }

}


