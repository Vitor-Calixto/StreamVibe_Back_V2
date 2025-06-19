package com.streamvibe.api.models.DadosCadastrousuario;
public record DadosCadastrousuario(
String id,
String nome, 
String dataDeNascimento,
 String email,
  String senha,
   String cpf, 
   DadosCadastroEndereco
   endereco
 ) {
    
}
           