package Recursos_Humanos;

import Pagamento.Calculo_Salario;
import Pagamento.Salario;
import Identifica��o.Empresa;
import Identifica��o.Funcionario;

public class RH_Central {
	
	public static void main(String args[]) {
		Salario s = new Salario();
		Calculo_Salario c = new Calculo_Salario();
		Empresa d = new Empresa();
		Funcionario e = new Funcionario();
		
		s= valores(s);
		s.get_salario();
		d.set_nome_Empresa("F�brica de Copos");
		d.set_se��o("Modela Vidro");
		e.set_nome_funcionario("Francisco Jos�");
		e.set_matr�cula("654YFV800");
		Imprime(c, d, e, c);
	}
	
public static Salario valores(Salario r) {
	r.set_salario(1234.90);
	r.set_horas_trabalhadas(8.8);
	r.set_dias_trabalhados(28);
	
	return r;	
}

public static void Imprime(Calculo_Salario c, Empresa d, Funcionario e, Salario r) {
	System.out.println("Empresa:" + d.get_nome_Empresa());
	System.out.println("Se��o:" + d.get_se��o());
	System.out.println("Funcion�rio:" + e.get_nome_funcionario());
	System.out.println("Matr�cula:" + e.get_matr�cula());
	System.out.println("Sal�rio: R$" + c.Calculo_Salario(r));
}
	
	
}