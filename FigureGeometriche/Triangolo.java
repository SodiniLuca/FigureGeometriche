public class Triangolo extends FigureGeometriche{
	float base;
	float altezza;
	float lato2;
	float lato3;

	Triangolo(String nome, float base, float lato2, float lato3, float altezza){
		this.nome = nome;
		this.base = base;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.altezza = altezza;
	}
	
	@Override
	public static float calcolaArea(){
		return (base * altezza) / 2;
	}
	
	@Override
	public static float calcolaPerimetro(){
		return base + lato2 + lato3;
	}
 }