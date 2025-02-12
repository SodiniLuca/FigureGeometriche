public class Pentagono extends FigureGeometriche{
	float lato;

	Pentagono(String nome, float lato){
		this.nome = nome;
		this.lato = lato;
	}
	
	@Override
	public static int calcolaArea(){
		return lato * lato;
	}
	
	@Override
	public static int calcolaPerimetro(){
		return lato * 4;
	}
 }