public class Filme {
	//int a pessoa adicionara um numero inteiro como codigo de algum filme
	private int codigo;

	//string adicionara um nome de filme no formato de texto
	private String nome;

	//doble adicionara o valor do filme com as casas decimais
	private double valor;
	
	//se esta disponivel ou não
	private boolean disponivel;

	//pegará o valor inserido em codigo
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	//pegará o texto inserido em nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//pegará o valor inserido em valor
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	//mostrará se esta ou não disponivel
	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	//caso teha o filme mostrará true e sara como disponivel
	//casso de false, irá para else e exibira que não esta disponivel
	public void retirar() {
		if(disponivel == true) {
			disponivel = false;
		}else{
			throw new RuntimeException("Este filme não está disponível para locação!");
		}
				
	}

	public void devolver() {
		disponivel = true;
	}
	
	//exibirá (ira imprimir) tudo que foi pesquisado
	public void mostra(){
		System.out.println("Código do filme:" + this.codigo);
		System.out.println("Nome do filme:" + this.nome);
		System.out.println("Valor: R$" + this.valor);		
		System.out.println("Disponível:" + this.disponivel);
	}
	

}