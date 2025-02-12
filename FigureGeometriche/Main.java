public class Main{
	public static void main (String[]args){
		Quadrato quadrato = new Quadrato("Quadrato",10);
		Triangolo triangolo = new Triangolo("Triangolo",1,2,3,4);
		Cerchio cerchio = new Cerchio("Cerchio",5);
		System.out.print("Area quadrato: " + quadrato.calcolaArea() + "\n");
		/*
		"Perimetro quadrato: " + Quadrato.quadrato.calcolaPerimetro() + "\n" +
		"Area triangolo: " + Triangolo.triangolo.calcolaArea() + "\n" +
		"Perimetro triangolo: " + Triangolo.triangolo.calcolaPerimetro() + "\n" +
		"Area cerchio: " + Cerchio.cerchio.calcolaArea() + "\n" +
		"Perimetro cerchio: " + Cerchio.cerchio.calcolaPerimetro() + "\n");
		*/
	}
}