package test;

import carros.CarroBase;
import carros.Crossover;
import carros.Pickup;
import carros.Sedan;
import carros.Suv;
import motores.MotorDiesel;
import motores.MotorGasolina;

public class Test {
	
	
	

	public static void main(String[] args) {
	     //CarroBase carro = new CarroBase(); //composition
	     //carro.imprimirCategoria();
		 //System.out.println("*****hello world 2*****");
		CarroBase carro;
		MotorDiesel motorDiesel = new MotorDiesel();
		
		carro = new Pickup(motorDiesel);//polimorfismo
		carro.imprimirCategoria();
	       
		MotorGasolina motorGasolina = new MotorGasolina();//composicion
		
		carro = new Sedan(motorGasolina);
		carro.imprimirCategoria();
		
		carro = new Crossover(motorGasolina);
		carro.imprimirCategoria();
		
		
		
		
		
		
				
		/*MotorDiesel motorDiesel = new MotorDiesel();
		carro = new Sedan(motorDiesel);//polimorfismo
		carro.imprimirCategoria();
		
		
		carro = new Pickup(motorGasolina);
		carro.imprimirCategoria();
		
		carro = new Pickup(motorDiesel);
		carro.imprimirCategoria();
		
		
		carro = new Suv(motorDiesel);
		carro.imprimirCategoria();
		
		carro = new Suv(motorGasolina);
		carro.imprimirCategoria();
		*/
		
		
		
	}
	
}
