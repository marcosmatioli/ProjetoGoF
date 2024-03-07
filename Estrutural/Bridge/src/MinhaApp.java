
public class MinhaApp {

	public static void main(String[] args) {
		
		Professor grad = new ProfessorGraduacao(new ProfessorImplGraduacao());
		//então ele instancio um professor, passando o implementador como parametro para inicializar o seu implementador
		grad.op();
		//então nós conseguimos alterar tanto no objeto do professorGraduaçao quanto no professor implement graduação que um consegue
		//consegue ser alterado sem que mexa no outro, então com isso conseguimos separar a abstração da sua implementação
		//manter eles separados, também mantem escondida a implementação do usuario
	}
}