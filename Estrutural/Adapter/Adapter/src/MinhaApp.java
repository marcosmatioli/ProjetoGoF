
public class MinhaApp {

	public static void main(String[] args) {
		//Target
		TomadaBrasileira tomadaBras = new TomadaBrasileira();
		TomadaAmericana tomadaEUA = new TomadaAmericana();
		
		//Adaptado
		PlugAmericano plugEUA = new PlugAmericano();
		PlugBrasileiro plugBR = new PlugBrasileiro();
		
		AdapterEUAtoBrasil tomadaModificada = new AdapterEUAtoBrasil();
		String s = tomadaModificada.conecta(plugEUA);
		
		AdapterBrasiltoEUA tomadaModificadaBrasil = new AdapterBrasiltoEUA();
		String x = tomadaModificadaBrasil.conecta(plugBR);
		
		System.out.println(s);
		System.out.println(x);
		//então aqui temos o exemplo das tomadas e dos plugs basicamente vc consegue
		//fazer com que um converse com o outro a partir de um adaptador
		//então eu implementei o plug brasileiro que conecta na tomada americana
		//e podemos ver que ele funcinou perfeitamente
	}

}
