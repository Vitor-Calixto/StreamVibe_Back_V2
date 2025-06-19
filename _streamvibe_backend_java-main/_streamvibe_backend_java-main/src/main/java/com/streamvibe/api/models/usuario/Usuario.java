package com.streamvibe.api.models.Usuario;

import jakarta.persistence.*;
import lombok.*;


// Nome, data de nascimento, email, senha, cpf => Tudo String
@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private  String dataDeNascimento;
    private String email;
    private String senha;
    private String cpf;

    @Embedded
    private Endereco endereco;

    public Usuario(DadosCadastroUsuario dados) {
      
        this.nome = dados.nome();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.email = dados.email();
        this.senha = dados.senha();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
    }
}
