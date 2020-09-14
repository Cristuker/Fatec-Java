
package com.mycompany.aula04;


public class Init {
    public static void main(String[] args) {
        Endereco e = new Endereco("Rua: Araguacu", "Guarujá", Estado.SP);
        Cliente aluno = new Cliente("Cristian Silva", e);
        aluno.mostrarDados();
    }
}
