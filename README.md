# Juego del Ahorcado en Java

## Descripción

Este es un juego clásico del **Ahorcado** implementado en Java.
El jugador debe adivinar la palabra secreta letra por letra antes de quedarse sin intentos.
El juego selecciona una palabra aleatoria de una lista predefinida y muestra su progreso con guiones bajos (`_`) para las letras no adivinadas.

---

## Cómo jugar

1. Clona o descarga el repositorio.
2. Compila y ejecuta el juego usando tu IDE favorito o desde la terminal:

```bash
javac Main.java
java Main
```

3. Ingresa tu nombre cuando el juego lo solicite.

4. Pulsa **ENTER** para comenzar y que se seleccione una palabra secreta aleatoria.

5. Ingresa letras una por una para intentar adivinar la palabra:

   * Las letras correctas se mostrarán en su posición correspondiente.
   * Las letras incorrectas aumentarán el contador de intentos fallidos.
   * No se permiten letras repetidas; si ingresas una letra ya usada, recibirás un aviso.

6. Tienes un máximo de **4 intentos fallidos** por palabra.

7. El juego termina cuando:

   * Adivinas todas las letras de la palabra → mensaje de victoria.
   * Superas el límite de intentos fallidos → mensaje de derrota.

---

## Características

* Selección aleatoria de palabras de una lista predefinida.
* Visualización de la palabra oculta con guiones bajos.
* Control de letras ya usadas para evitar repeticiones.
* Conteo de intentos fallidos con límite definido.
