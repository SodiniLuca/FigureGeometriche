public class Triangolo extens FigureGeometriche{
	float base;
	float altezza;

	Triangolo(String nome, float base, float altezza){
		this.nome = nome;
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public static int calcolaArea(){
		return (base * altezza) / 2;
	}
 }