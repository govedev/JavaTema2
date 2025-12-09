# Chuleta de Java: Arrays, Cadenas y Métodos

Resumen de los conceptos de arrays, manipulación de cadenas y modularidad en Java, extraídos de ejercicios prácticos.

## 1. Arrays (Vectores y Matrices)
Estructuras que permiten almacenar múltiples valores del mismo tipo en una sola variable.

### Arrays Unidimensionales (Vectores)

**Declaración e Inicialización**
Se puede inicializar vacío con un tamaño definido o con valores directos.

```java
// Inicialización con tamaño definido (valores por defecto son 0, false o null)
double [] numeros = new double[5];
String[] cadenasUsuarioStrings = new String[100];

// Inicialización con valores directos
int [] diasPorMes = {31,28,31,30,31,30,31,31,30,31,30,31};```
```
**Recorrer un Array**
Se utiliza un bucle `for` para iterar sobre sus elementos.

```java
// Bucle for tradicional (necesario si se necesita el índice)
for (int i=0; i<numeros.length; i++) {
    System.out.println("Introduzca el número de la posición " + i + ":");		
    numeros[i] = teclado.nextDouble();
}

// Bucle for-each (más simple, para leer valores)
for (int[] is : matriz) {
    // ...
}
```
**Acceder a Elementos**
Se accede a través de su índice, que empieza en 0.

```java
max = numeros[0]; // Accede al primer elemento
System.out.print(diasPorMes[mes-1]); // Accede a un elemento calculado
```
### Arrays Bidimensionales (Matrices)

**Declaración e Inicialización**
Arrays que contienen otros arrays (filas y columnas).

```java
// Matriz de 20 filas y 3 columnas
String [][] usuarios = new String [20][3];

// Matriz con valores predefinidos
int matrizA [][] = {{5,7,9},{2,5,3},{8,1,9}};
```

**Recorrer una Matriz**
Se necesitan bucles anidados, uno para las filas y otro para las columnas.

```java
for (int i=0; i<FILAS; i++) {
    for (int j=0; j<COLUMNAS; j++) {
        // Acceso al elemento en la fila i, columna j
        System.out.print("[" + matriz[i][j] + "]");
    }
    System.out.println(); // Salto de línea al final de cada fila
}
```
### Propiedad `.length`
Devuelve el tamaño del array.
- En **vectores**: `miArray.length` devuelve el número total de elementos.
- En **matrices**:
    - `miMatriz.length` devuelve el número de **filas**.
    - `miMatriz[i].length` devuelve el número de **columnas** de la fila `i`.

### Patrones Comunes con Arrays
- **Búsqueda de un elemento**: Recorrer el array y comparar cada elemento con el valor buscado.
```java
boolean encontrado = false;
for (int i=0; i<numeros.length; i++) {
    if (buscado == numeros[i]) {
        encontrado = true;
    }
}
```
- **Uso de un array como contador**: El índice del array representa el valor a contar, y el contenido del array en ese índice, las veces que ha aparecido.
```java
// 'contadores' tiene 21 posiciones (0-20)
int [] contadores = new int[21];
// 'numeros[i][j]' contiene un valor entre 0 y 20
contadores[numeros[i][j]]++; // Se incrementa la posición correspondiente
```
## 2. La Clase `String` (Cadenas de Texto)

### Métodos Fundamentales
- `.length()`: Devuelve la longitud de la cadena.
- `.charAt(índice)`: Devuelve el carácter en la posición especificada.
- `.toUpperCase()` / `.toLowerCase()`: Convierten la cadena a mayúsculas o minúsculas.

```java
for (int i=0; i<cadena.length(); i++) {
    System.out.println(cadena.charAt(i));
}
String nombreMayus = nombre.toUpperCase();
```
### Comparación y Búsqueda
- `.equals(otraCadena)`: Compara si dos cadenas son exactamente iguales (sensible a mayúsculas).
- `.contains(subcadena)`: Devuelve `true` si la cadena contiene la subcadena.
- `.startsWith(prefijo)`: Devuelve `true` si la cadena empieza con el prefijo indicado.

```java
if (usuarios[i][0].equals(nombre)) { /* ... */ }
if (string.startsWith("https://")) { /* ... */ }
if (mayusculas.contains(letras[i])) { /* ... */ }
```
### Manipulación de Cadenas
- `.trim()`: Elimina los espacios en blanco al principio y al final.
- `.split(separador)`: Divide la cadena en un array de `String` usando un separador.
- `.replace(charAntiguo, charNuevo)`: Reemplaza todas las apariciones de un carácter.
- `.replaceAll(stringAntigua, stringNueva)`: Reemplaza todas las apariciones de una subcadena.

```java
String [] palabras = cadena.trim().split(" ");
String cadenaSinEspacios = cadena.replace(" ","");
palabra = palabra.replaceAll(" ","");
```
### Conversión entre `String` y `char[]`
- `cadena.toCharArray()`: Convierte una cadena a un array de caracteres.
- `new String(arrayDeChars)`: Crea una nueva cadena a partir de un array de caracteres.
```java
char[] arrayDeCaracteres = string.toCharArray();
// ... manipular arrayDeCaracteres ...
return new String(arrayDeCaracteres);```

## 3. Modularidad (Métodos)
Bloques de código reutilizables que realizan una tarea específica. Ayudan a organizar y simplificar el programa.

### Definición de un Método
Su estructura es: `[modificador] static [tipo_retorno] nombreMetodo([parámetros]) { ... }`

- **`modificador`**: `public` (accesible desde cualquier clase) o `private` (solo desde la misma clase).
- **`static`**: Indica que el método pertenece a la clase y no a un objeto.
- **`tipo_retorno`**: El tipo de dato que devolverá el método (`int`, `boolean`, `String`, `int[]`, etc.) o `void` si no devuelve nada.
- **`parámetros`**: Variables que el método recibe para trabajar con ellas.

### Métodos que no devuelven valor (`void`)
Realizan una acción, como imprimir algo en pantalla.
```java
public static void borrarPantalla() {
    for (int i=0; i<25; i++) {
        System.out.println();
    }
}
```### Métodos que devuelven un valor (`return`)
Realizan un cálculo o una operación y devuelven un resultado, que debe ser del mismo tipo que el `tipo_retorno`.
```java
// Devuelve un boolean
static boolean existeUsuario(String[][] usuarios, String nombre) {
    boolean existe = false;
    // ... lógica para buscar ...
    return existe;
}

// Devuelve un array
public static int[] crearArrayAleatorios(int tam, int limite) {
    int [] devuelto = new int [tam];
    // ... lógica para rellenar ...
    return devuelto;
}
```
### Llamada a Métodos
Para ejecutar un método, se escribe su nombre y se le pasan los argumentos (valores para los parámetros) entre paréntesis.
```java
// Llamada a un método void
dibujarCuadrado(5);

// Llamada a un método que devuelve un valor
boolean primo = esPrimo(numero);
int [] sinDuplicados = eliminarDuplicados(conDuplicados);
```
Un método puede llamar a otro para delegar tareas.
```java
public static float calcularPromedio(float [] cal) {
    float suma = sumarElementos(cal); // Llama a otro método
    return suma / cal.length;
}
```
## 4. Organización del Código (Paquetes)
Los paquetes son carpetas que agrupan clases relacionadas, evitando conflictos de nombres y mejorando la organización.

### Declarar un Paquete
La primera línea del fichero `.java` debe ser la declaración del paquete.```java
package ejercicio6.main;
```
### Importar Clases de otros Paquetes
Para usar una clase que está en otro paquete, se debe importar.
```java
// Se importa la clase 'metodos' del paquete 'ejercicio6.methods'
import ejercicio6.methods.metodos;
```
### Uso de Clases Importadas
Una vez importada, se pueden llamar a sus métodos estáticos usando `NombreClase.nombreMetodo()`.```java
// 'metodos' es la clase importada, 'convertirH1' es un método estático de esa clase
cadenasUsuarioStrings[i] = metodos.convertirH1(cadenaUsuario);```
