package Examen;
import java.util.Iterator;
import java.util.Scanner;

import Examen.Operaciones;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
boolean salir=false;


while (salir==false) {
	System.out.println("--------------------------");
	System.out.println("                   ");
	System.out.println("       MENU        ");
	System.out.println("                   ");
	System.out.println("  1.Sumar          ");
	System.out.println("  2.Restar          ");
	System.out.println("  3.Multiplicar          ");
	System.out.println("  4.Dividir          ");
	System.out.println("  5.Resto          ");
	System.out.println("  6.Exponencial          ");
	System.out.println("            ");
	System.out.println(" Escriba la opcion deseada:          ");
    int opcion=scanner.nextInt();
	System.out.println(" Dime un numero:          ");
	int numero1=scanner.nextInt();
	System.out.println(" Dime otro:          ");
	System.out.println("            ");
    int numero2=scanner.nextInt();
    Operaciones op= new Operaciones(numero1,numero2);
    
    if (opcion==1) {
       op.setOperacionSuma(numero1, numero2);
       System.out.println("El resultado de la suma es "+op.getOperaciones());
	}
    
    if (opcion==2) {
       op.setOperacionResta(numero1, numero2);
       System.out.println("El resultado de la resta es "+op.getOperaciones());
	}

   	if (opcion==3) {
       op.setOperacionMultiplica(numero1, numero2);
       System.out.println("El resultado de la multiplicacion es "+op.getOperaciones());
}

    if (opcion==4) {
	   
       op.setOperacionDivide(numero1, numero2);
       System.out.println("El resultado de la division es "+op.getOperaciones());
}

    if (opcion==5) {
	   
       op.setOperacionResto(numero1, numero2);
       System.out.println("El resultado del resto es "+op.getOperaciones());
}

    if (opcion==6) {
    	int sumatotal=0;
       op.setOperacionExponente(numero1, numero2);
       
    	if (numero2==1) {
			sumatotal=numero1;
		}
    	else if (numero2==0) {
			sumatotal=1;
		}
    	
    	else {
			for (int i=1;i<numero2; i++) {
			int resultado=numero1*numero1;
			sumatotal=resultado+sumatotal;
		}
	}
    
    	System.out.println("El resultado del numero exponencial es "+sumatotal);
}
    
    if (opcion<1 || opcion>6) {System.out.println("Valor no valido");
		
	}


	}

}

}
