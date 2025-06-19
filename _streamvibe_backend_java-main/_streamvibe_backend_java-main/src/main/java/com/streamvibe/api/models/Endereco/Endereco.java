package com.streamvibe.api.models.Endereco;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable


public class Endereco {


    
    private String Rua;
    private String numero;
    private String Bairro;
    private String cep;
    private String cidade;
    private String complemento;

    
    
public Endereco(DadosCadstroEndereco dados) {
        this.Rua = dados.Rua();
        this.numero = dados.numero();
        this.Bairro = dados.Bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
    }
}

