package es.Studium.Pendiente;

import java.util.Scanner;

public class Pendiente 
{
	public static void main(String[] args) 
	{
		double y1,y2,x1,x2;
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca y1");
		y1 = teclado.nextDouble();
		System.out.println("Introduzca y2");
		y2 = teclado.nextDouble();
		System.out.println("Introduzca x1");
		x1 = teclado.nextDouble();
		System.out.println("Introduzca x2");
		x2 = teclado.nextDouble();
		teclado.close();
		pendiente (y1, y2 ,x1 ,x2);
	}
	public static void pendiente (double y1, double y2, double x1, double x2)
	{
		System.out.println("El resultado de m es "+(((double)y2-(double)y1)/((double)x2-(double)x1)));
	}
}
