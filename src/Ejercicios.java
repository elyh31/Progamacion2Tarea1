import java.util.*;

public class Ejercicios
{
	//deveulve true si "numero" es par y false de lo contrario
	static boolean esPar(int numero)
	{
		// el if revisa sy el numero es divicible entre 2
		if (numero % 2 == 0)
		{
			return true;
		}
		else
			return false;
	}
	
	//devuelve "gratis" si lempiras es igual a 0
	//devuelve "barato" si lempiras es menor que 100
	//devuelve "normal" si lempiras es menor que 200
	//de lo contrario devuelve caro
	//nota: solo aceptan minusculas
	static String obtenerPrecio(int lempiras)
	{
		// al cumplir con cualquiera de las funciones de los if re gresa ese resulta, 
		// de no se asi regresa el else
		if(lempiras == 0)
		{
			return "gratis";
		}
		if(lempiras < 100 || lempiras == 100)
		{
			return "barato";
		}
		if(lempiras < 200 || lempiras == 200)
		{
			return "normal";
		}
		else
			return "caro";
	}
	
	//devuelve el factorial de "num"
	static int factorial(int num)
	{
		// se sacara el factorial hasta el numero que ingrese el usuario
		int suma = 1;
		for(int i=1; i<=num; i++)
		{
			suma = suma * i;
		}
		return suma;
	}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	static int getElemento(int arr[],int pos)
	{
		// devolvera el numero del arreglo que se mande a llamar
		int arr1[]=new int[5];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		return arr1[pos];
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	static int getElemento(int arr[][],int col,int fila)
	{
		// devolvera el numero del arreglo que se mande a llamar en el numero de columna y posicion
		int arr1[][]=new int[5][5];
		arr1[0][0]=10;
		arr1[1][1]=20;
		arr1[2][2]=30;
		arr1[3][3]=40;
		arr1[4][4]=50;
		return arr1[col][fila];
	}
	
	//devuelve el atributo "x" de "MiClase"
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	static int fibonacci(int num)
	{
		if (num == 0)
		    return 1;
		if (num == 1)
			return 1;
		return fibonacci(num-1) + fibonacci(num-2);
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 1 y funcionRecursiva(1) = 2
	static int funcionRecursiva(int num)
	{
		if (num == 0)
		    return 1;
		if (num == 1)
			return 2;
		return funcionRecursiva(num-1)*2+1;
	}
	
	public static void main(String[] args)
	{
		
		//nota: 
		//en el main me corren bioen los programas pero en el avaluador no se porque no los corre bien
		
		
	/*	Scanner s = new Scanner (System.in); 
		int numero;
		System.out.print("ingese un numero: ");
		numero = s.nextInt();
		System.out.print(esPar(numero));      */
		
		
		
	 /*   Scanner s = new Scanner (System.in); 
		int lempiras;
		System.out.print("ingese precio: ");
		lempiras = s.nextInt();
		System.out.print(obtenerPrecio(lempiras));      */
	
		
		
	 /*   Scanner s = new Scanner (System.in); 
		int num;
		System.out.print("ingese un numero: ");
		num = s.nextInt();
		System.out.print("el factorial de: "+ num + " es: " +factorial(num));      */

		
	 /*   Scanner s = new Scanner (System.in); 
		int pos;
		System.out.print("ingese numero de posicion: ");
		pos = s.nextInt();
		int arr1[] = null;
		System.out.print(getElemento(arr1,pos));      */
		
		
		
		/*    Scanner s = new Scanner (System.in); 
		int col;
		int fila;
		System.out.print("ingese numero de columna: ");
		col = s.nextInt();
		System.out.print("ingese numero de fila: ");
		fila = s.nextInt();
		int arr1[][] = null;
		System.out.print(getElemento(arr1,col,fila));    */  
		
		

		
		
		 
		
		/*  for (int n=0; n<10; n++)
		System.out.println(fibonacci(n));   */
	
		
	    /*	for (int n=0; n<10; n++)
		System.out.println(funcionRecursiva(n));   */
			
	}
}
