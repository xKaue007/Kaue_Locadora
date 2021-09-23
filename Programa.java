//nome da classe
public class Programa {

	// definindo o metodo MAIN
	public static void main(String[] args) {

		//puxando a aba filme
		Filme f = new Filme();

		//pegar o valor inseirdo no caso "Codigo"
		f.setCodigo(123);

		//pegar o valor inseirdo no caso "Nome do Filme"
		f.setNome("A Era do Gelo");

		//pegar o valor inseirdo no caso "Valor"
		f.setValor(2.50);

		//pegar o valor inseirdo no caso "se está disponivel ou não"
		f.devolver();
		
		//pegar o valor inseirdo no caso "imprimir tudo que o cliente pediu"
		f.mostra();
		
		f.retirar();
		
		f.mostra();
		
		try {
			f.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}