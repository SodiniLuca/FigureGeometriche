public class Cerchio extends FigureGeometriche{
	float raggio;

	Cerchio(String nome, float raggio){
		this.nome = nome;
		this.raggio = raggio;
	}
	
	@Override
	public static float calcolaArea(){
		return (raggio * raggio) * 3.14;
	}
	
	@Override
	public static float calcolaPerimetro(){
		return 2 * 3.14 * raggio;
	}
 }