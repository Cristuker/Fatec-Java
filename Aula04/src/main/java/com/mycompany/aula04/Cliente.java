
package com.mycompany.aula04;

public class Cliente {
    private String nome;
    private Endereco endereco;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void mostrarDados(){
        System.out.println("Nome: "+ nome);
        endereco.mostrarEndereco();
    }
}
