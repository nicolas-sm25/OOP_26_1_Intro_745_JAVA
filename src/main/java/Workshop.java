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
        int[] aux = new int[arreglo.length];
    	int count = 0;

    	for (int i = 0; i < arreglo.length; i++) {
	 int x = 0;
         for (int j = 0; j < count; j++) {
          if (arreglo[i] == aux[j]) {
           x++;
            }}
          if (x == 0) {
           aux[count] = arreglo[i];
           count++;
        }}
        int[] sinDups = new int[count];
        for (int i = 0; i < count; i++) {
         sinDups[i] = aux[i];

    }
        return sinDups;
    }
     


    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
	int[] combinados = new int[arreglo1.length + arreglo2.length];
	for (int i = 0 ; i < arreglo1.length; i++){
	 combinados[i] = arreglo1[i];
	}
	for (int j = 0 ; j < arreglo2.length; j++){
	 combinados[j + arreglo1.length] = arreglo2[j];
	}
        return combinados;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int[] rotado = new int[arreglo.length];
	int n = 0;
	for (int i = 0; i < arreglo.length; i++){
	 rotado[i] = arreglo[(i-posiciones+arreglo.length) % arreglo.length];
	}
        return rotado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        int x = cadena.length(); 
	return x;
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        char[] origin = cadena.toCharArray();
	char[] invert = new char[origin.length];	
	for (int i = 0; i < origin.length; i++){
	 invert[i] = origin[origin.length-1-i];
	} 
        return new String(invert);
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
	cadena = cadena.toLowerCase().replace(" ","");
        char[] palabra = cadena.toCharArray();
	for (int i = 0; i < palabra.length/2; i++){
	 if ( palabra[i] != palabra[palabra.length-1-i]){
	  return false;
	}}
        return true;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
	if (cadena.equals("")) {
         return 0;
    	}
	int palabras = cadena.split("\\s+").length;        
        return palabras;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        cadena = cadena.toUpperCase();
        return cadena;
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
   	cadena = cadena.toLowerCase();
        return cadena;
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        cadena = cadena.replace(antiguaSubcadena,nuevaSubcadena);
        return cadena;
    }


    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        int n = cadena.indexOf(subcadena);
        return n;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
  
        return correo.matches("[A-Za-z0-9._-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
	if (lista.size() == 0){
	 return 0.0;
	}
	int num = 0;
        for (int i = 0; i < lista.size(); i++) {
    	 num += lista.get(i);
	}
	double prom = (double) num/lista.size();
	return prom;
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        String binario = Integer.toBinaryString(Math.abs(numero));
	if (numero<0){
	 binario = "-"+binario;
	}
        return binario;
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        String hexa = Integer.toHexString(Math.abs(numero));
	if (numero<0){
	 hexa = "-"+hexa;
	}
        return hexa.toUpperCase();

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
	double area = Math.PI*(Math.pow(radio,2));
        return area;
    }

    public String zoodiac(int day, int month) {

	if ((day > 29 && month == 2) || (day == 31 && (month == 4 || month == 	6 || month == 9 || month == 11)) || day > 31 || day <= 0 || month > 12 	|| month <= 0){
	 return "Invalid Date";
	}

	if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
        return "Aries";
    	} else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
         return "Taurus";
    	} else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
         return "Gemini";
    	} else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
         return "Cancer";
    	} else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
         return "Leo";
    	} else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
         return "Virgo";
    	} else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
         return "Libra";
    	} else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
         return "Scorpio";
    	} else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
         return "Sagittarius";
    	} else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
         return "Capricorn";
    	} else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
         return "Acuarius";
    	} else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
         return "Pisces";
    	}
	return "Invalid Date";
	}



}

