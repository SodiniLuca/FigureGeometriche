public class Quadrato extens FigureGeometriche{
	float lato;

	Quadrato(String nome, float lato){
		this.nome = nome;
		this.base = lato;
	}
	
	@Override
	public static int calcolaArea(){
		return lato * lato;
	}
 }