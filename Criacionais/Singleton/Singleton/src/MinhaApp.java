
public class MinhaApp {

	public static void main(String[] args) {
		/*aqui ele deu get instancia e conseguiu iniciar a janela
		 * então agora sim teremos somente uma
		 * */
		Janela j = Janela.getInstance();
		j.pack();
		j.setVisible(true);
		/*então agora quando tentamos criar outra instancia do objeto temos que
		 * ele retorna a primeira instancia e não a segunda
		 * */
		Janela j2 = Janela.getInstance();
		j2.pack();
		j2.setVisible(true);
	}

}
