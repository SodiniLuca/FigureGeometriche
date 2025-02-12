public class Quadrato extends FigureGeometriche{
	double lato;

	Quadrato(String nome, double lato){
		this.nome = nome;
		this.lato = lato;
	}
	
	@Override
	public String calcolaArea(){
		return (lato*lato) + "";
	}
	
	@Override
	public double calcolaPerimetro(){
		return lato * 4;
	}
 }