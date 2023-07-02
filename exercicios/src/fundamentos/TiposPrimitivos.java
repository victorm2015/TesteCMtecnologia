package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// informações do funcionario
		
		//tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 567889;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = false; //true
		
		//tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// numero de viagens
		System.out.println("Voos: " + numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		
		System.out.println("Férias: " + estaDeFerias);
		
		System.out.println("Funcionarios ativo ou inativo: " + status);
	}

}
