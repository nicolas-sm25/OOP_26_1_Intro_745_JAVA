# Workshop 1 - TDD en Java

Taller de programación orientada a objetos usando **Test-Driven Development (TDD)**. El objetivo es implementar los métodos de la clase `Workshop.java` para que todos los tests en `WorkshopTest.java` pasen.

---

## Flujo de trabajo

```
Fork del repo  →  Clonar tu fork  →  Leer el test  →  Escribir el código  →  Hacer push
```

---

## Estructura del proyecto

```
workshop1/
├── src/
│   ├── main/java/Workshop.java     # ESTE es el archivo que debes editar
│   └── test/java/WorkshopTest.java # Tests (NO modificar)
└── pom.xml
```

---

## Instrucciones para resolver el taller (solo con Notepad o editor de texto)

### Paso 1 - Hacer un Fork del repositorio

El fork crea una copia del repositorio en tu propia cuenta de GitHub, donde podrás subir tus cambios.

1. Ve a `https://github.com/sigmotoa/POO1_Workshop`
2. Haz clic en el botón **Fork** (esquina superior derecha)
3. Selecciona tu cuenta de GitHub como destino
4. Espera a que GitHub termine de crear tu fork

A partir de este punto trabajarás sobre **tu fork**, no sobre el repositorio original.

### Paso 2 - Clonar tu fork

Copia la URL de **tu fork** (no la del repositorio original) y ejecuta:

```bash
git clone https://github.com/TU_USUARIO/POO1_Workshop.git
cd POO1_Workshop
```

> Reemplaza `TU_USUARIO` con tu nombre de usuario de GitHub.

### Paso 3 - Abrir el archivo en Notepad

Abre el archivo con cualquier editor de texto:

- **Windows:** clic derecho sobre `src/main/java/Workshop.java` → Abrir con → Bloc de notas
- **Mac/Linux:** `open -a TextEdit src/main/java/Workshop.java`

### Paso 4 - Leer el test antes de implementar (TDD)

Abre `src/test/java/WorkshopTest.java` en otro editor de texto y lee el test del método que vas a implementar. El test te dice exactamente qué debe hacer el método y cuáles son los casos de prueba.

**Ejemplo:** Para implementar `mayorDeTresNumeros`, el test dice:

```java
assertEquals(7, workshop.mayorDeTresNumeros(3, 7, 5));
assertEquals(3, workshop.mayorDeTresNumeros(3, 2, 1));
assertEquals(5, workshop.mayorDeTresNumeros(5, 5, 5));
```

Esto significa que el método debe retornar el mayor de los tres números.

### Paso 5 - Implementar el método en Workshop.java

Busca el método que quieres implementar en `Workshop.java`. Cada método tiene un comentario `// TODO` con instrucciones. Reemplaza el cuerpo del método con tu implementación.

**Antes:**
```java
public int mayorDeTresNumeros(int a, int b, int c) {
    // TODO: Implementar el método para retornar el mayor de los tres números enteros.
    return 0;
}
```

**Después (ejemplo de implementación):**
```java
public int mayorDeTresNumeros(int a, int b, int c) {
    if (a >= b && a >= c) return a;
    if (b >= c) return b;
    return c;
}
```

### Paso 6 - Guardar y subir los cambios a tu fork

```bash
git add src/main/java/Workshop.java
git commit -m "Implementar mayorDeTresNumeros"
git push origin main
```

---

## Métodos por implementar

El archivo `Workshop.java` ya tiene el método `sumarDosNumeros` implementado como ejemplo. Tu tarea es implementar todos los demás:

| Método | Descripción |
|--------|-------------|
| `mayorDeTresNumeros(a, b, c)` | Retorna el mayor de tres enteros |
| `tablaMultiplicar(numero, limite)` | Retorna un arreglo con la tabla de multiplicar |
| `factorial(n)` | Calcula el factorial; lanza `IllegalArgumentException` si `n < 0` |
| `esPrimo(numero)` | Retorna `true` si el número es primo |
| `serieFibonacci(n)` | Retorna los primeros `n` términos de Fibonacci; lanza `IllegalArgumentException` si `n < 0` |
| `sumaElementos(arreglo)` | Suma todos los elementos del arreglo |
| `promedioElementos(arreglo)` | Calcula el promedio del arreglo |
| `encontrarElementoMayor(arreglo)` | Encuentra el elemento mayor |
| `encontrarElementoMenor(arreglo)` | Encuentra el elemento menor |
| `buscarElemento(arreglo, elemento)` | Retorna `true` si el elemento está en el arreglo |
| `invertirArreglo(arreglo)` | Invierte el orden del arreglo |
| `ordenarArreglo(arreglo)` | Ordena el arreglo de menor a mayor |
| `eliminarDuplicados(arreglo)` | Elimina elementos repetidos |
| `combinarArreglos(arreglo1, arreglo2)` | Concatena dos arreglos |
| `rotarArreglo(arreglo, posiciones)` | Rota el arreglo `n` posiciones a la izquierda |
| `contarCaracteres(cadena)` | Cuenta los caracteres de la cadena |
| `invertirCadena(cadena)` | Invierte la cadena |
| `esPalindromo(cadena)` | Retorna `true` si la cadena es palíndromo (sin distinguir mayúsculas) |
| `contarPalabras(cadena)` | Cuenta las palabras de la cadena |
| `convertirAMayusculas(cadena)` | Convierte la cadena a mayúsculas |
| `convertirAMinusculas(cadena)` | Convierte la cadena a minúsculas |
| `reemplazarSubcadena(cadena, vieja, nueva)` | Reemplaza una subcadena por otra |
| `buscarSubcadena(cadena, subcadena)` | Retorna el índice donde comienza la subcadena (`-1` si no existe) |
| `validarCorreoElectronico(correo)` | Valida que el correo tenga formato válido |
| `promedioLista(lista)` | Promedio de una `List<Integer>` |
| `convertirABinario(numero)` | Retorna la representación binaria como `String` |
| `convertirAHexadecimal(numero)` | Retorna la representación hexadecimal en mayúsculas como `String` |
| `jugarPiedraPapelTijeraLagartoSpock(eleccion)` | Juega contra la PC y retorna el resultado |
| `pptls2(game[])` | Determina ganador entre dos jugadores o empate |
| `areaCirculo(radio)` | Calcula el área del círculo |
| `zoodiac(day, month)` | Retorna el signo zodiacal según la fecha |

---

## Ejecutar los tests localmente (opcional)

Si tienes Java 17 y Maven instalados, puedes correr los tests en tu máquina sin necesidad de hacer push.

### Requisitos

- [JDK 17](https://adoptium.net/) (Temurin recomendado)
- [Apache Maven 3.x](https://maven.apache.org/download.cgi)

Verifica que estén instalados:

```bash
java -version
mvn -version
```

### Correr todos los tests

```bash
mvn clean test
```

### Ver el resultado

El output mostrará algo como:

```
[INFO] Tests run: 32, Failures: 5, Errors: 0, Skipped: 0
```

- **Tests run:** total de pruebas ejecutadas
- **Failures:** tests que fallaron (método no implementado correctamente)
- **Errors:** errores de compilación o excepciones inesperadas

Para ver el detalle de cada test fallido, revisa el output o abre los reportes en:

```
target/surefire-reports/
```

### Correr un test específico

```bash
mvn test -Dtest=WorkshopTest#testMayorDeTresNumeros
```

---

## Reglas del taller

- Haz fork del repositorio antes de comenzar
- Solo debes modificar `src/main/java/Workshop.java`
- **No modifiques** `WorkshopTest.java` ni `pom.xml`
- Sube tus cambios a **tu fork**

---

## Ejemplo de método ya implementado

```java
// Método que suma dos números enteros
public int sumarDosNumeros(int a, int b) {
    return a + b;
}
```

Este es el patrón a seguir para todos los demás métodos: reemplaza el `return 0;` (o `return "";` / `return new int[0];`) con la lógica correcta.
