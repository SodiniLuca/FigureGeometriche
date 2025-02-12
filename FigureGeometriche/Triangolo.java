public class Triangolo extends FigureGeometriche{
	double base;
	double altezza;
	double lato2;
	double lato3;

	Triangolo(String nome, double base, double lato2, double lato3, double altezza){
		this.nome = nome;
		this.base = base;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.altezza = altezza;
	}
	
	@Override
	public double calcolaArea(){
		return (base * altezza) / 2;
	}
	
	@Override
	public double calcolaPerimetro(){
		return base + lato2 + lato3;
	}
 }