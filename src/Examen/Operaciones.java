package Examen;

public class Operaciones {
private int numero1;
private int numero2;
private int resultado;

public Operaciones() {}

public Operaciones(int n1,int n2) {
	this.numero1=n1;
	this.numero2=n2;
}

public void setOperacionSuma(int n1,int n2) {
	this.numero1=n1;
	this.numero2=n2;
	this.resultado=n1+n2;
}

public void setOperacionResta(int n1,int n2) {
	this.numero1=n1;
	this.numero2=n2;
	this.resultado=n1-n2;
}

public void setOperacionMultiplica(int n1,int n2) {
	this.numero1=n1;
	this.numero2=n2;	
	this.resultado=n1*n2;

}

public void setOperacionDivide(int n1,int n2) {
	this.numero1=n1;
	this.numero2=n2;
	this.resultado=n1/n2;
}

public void setOperacionResto(int n1,int n2) {
	this.numero1=n1;
	this.numero2=n2;
	this.resultado=n1%n2;
}

public void setOperacionExponente(int n1,int n2) {
	this.numero1=n1;
	this.numero2=n2;

}

public int getOperaciones() {return resultado;}


}
