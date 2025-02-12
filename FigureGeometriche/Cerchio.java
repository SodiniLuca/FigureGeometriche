public class Cerchio extens FigureGeometriche{
	float raggio;

	Cerchio(String nome, float raggio){
		this.nome = nome;
		this.raggio = raggio;
	}
	
	@Override
	public static int calcolaArea(){
		return (raggio * raggio) * 3,14;
	}
 }