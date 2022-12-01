public class Teste {
	public static void main(String[] args) {
		FactoryPessoa factory = new FactoryPessoa();
		String nome = "Lucas Duarte";
		String sexo = "M";
		factory.getPessoa(nome, sexo);
	}
}