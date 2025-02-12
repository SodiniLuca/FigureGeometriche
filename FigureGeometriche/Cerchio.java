public class Cerchio extends FigureGeometriche{
	double raggio;

	Cerchio(String nome, double raggio){
		this.nome = nome;
		this.raggio = raggio;
	}
	
	@Override
	public double calcolaArea(){
		double area = (raggio * raggio) * 3.14;
		return (String) area;
	}
	
	@Override
	public double calcolaPerimetro(){
		return 2 * 3.14 * raggio;
	}
 }