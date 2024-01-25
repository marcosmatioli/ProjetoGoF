import java.awt.Dimension;


import javax.swing.JFrame;

//Singleton
public class Janela extends JFrame {
	
	private static Janela j = null;
	/*então como faz para ter somente uma instancia desse objeto?
	* podemos definir a instancia do objeto como private assim ele tem que chamar
	* então ele tem que fazer uso da instancia get instancia para poder iniciar a instancia
	*/
	private Janela() {
		setPreferredSize(new Dimension(640, 480));
	}
	
	public static Janela getInstance() {
		if(j==null){
			j = new Janela();
		}
		return j;
	}
	
}