import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {

        if ( a>b && a>c){
        	return a;
        } else if (b>c){
        	return b;
        } else {
        	return c;
        }  
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] resultado = new int[limite];
        for (int i=0; i<limite; i++) {
            resultado[i] = numero * (i+1) ;
        }
        return resultado;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        int resultado = 1;
        if ( n < 0){
          throw new IllegalArgumentException();
        } else if (n == 0) {
          return 1;
        } else { 
          for (int i=1; i<=n; i++){
           resultado = resultado * i;
          }
        return resultado;
     }
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero<2){
    	 return false;
      	}
        for (int i=2; i<=Math.sqrt(numero); i++){
          if ( numero % i == 0){
         return false;
	 } 
        }
      return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {

	int[] fibo = new int[n];
	

        if (n<=0){
          return fibo;
	}

        for (int i=0; i<n; i++){
	 if ( i == 0 ){
	  fibo[i] = 0;
	 } else if ( i == 1 ){
	  fibo[i] = 1;
	 } else {
	  fibo[i] = fibo[i-1] + fibo[i-2];
	 }
        }
        return fibo;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
	int suma = 0;
        for (int i=0; i < arreglo.length; i++){
	 suma = suma + arreglo[i];
	}
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
	if (arreglo.length == 0){
	 return 0.0;
	}
        int suma = 0;
        for (int i=0; i < arreglo.length; i++){
	 suma = suma + arreglo[i];
	}
	double promedio = (double) suma / arreglo.length;
        return promedio;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
	int mayor = Integer.MIN_VALUE;
        for ( int i=0; i<arreglo.length; i++){
	 if (arreglo[i] > mayor){
	  mayor = arreglo[i];
	 } }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = Integer.MAX_VALUE;
        for ( int i=0; i<arreglo.length; i++){
	 if (arreglo[i] < menor){
	  menor = arreglo[i];
	 } }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for ( int i=0; i<arreglo.length; i++){
	 if (arreglo[i] == elemento){
	  return true;
	 } 
	}
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
	int[] invertido = new int[arreglo.length];
         for (int i=0; i<arreglo.length; i++){
	  invertido[arreglo.length-i-1] = arreglo[i];
	 } 

        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {

	int[] ordenado = new int[arreglo.length];
	int menorActual = Integer.MAX_VALUE;
	int posMenor = 0;

	for (int j=0; j<arreglo.length; j++){
	 menorActual = Integer.MAX_VALUE;

         for (int i=0; i<arreglo.length; i++){
	  if ( menorActual > arreglo[i]){
	  menorActual = arreglo[i];
	  posMenor = i;
	  } }
	 arreglo[posMenor] = Integer.MAX_VALUE;
	 ordenado[j] = menorActual;
	 }
        return ordenado;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        return new int[0];
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        return new int[0];
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        return new int[0];
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        return 0;
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
        return "";
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        return false;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        return 0;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        return "";
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        return "";
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return "";
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return -1;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        return false;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        return 0.0;
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        return "";
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        return "";
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        return "";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
        return 0.0;
    }

    public String zoodiac(int day, int month) {
        return "";
    }


}

