public interface Boveda<T> {

    void guardar(T elemento);

    T sacar();

    boolean estaVacia();

    int tamanio();
}

// 1. Boveda es una interfaz porque solo define lo que debe hacer,
// sin decir exactamente cómo hacerlo. La ventaja es que diferentes
// clases pueden implementar Boveda de distintas maneras.

// 2. Si olvidas el caso base en factorial, la función nunca tendría
// una condición para detenerse y seguiría llamándose a sí misma hasta
// provocar un error por exceso de llamadas.

// 3. Usar genéricos (<T>) permite trabajar con diferentes tipos de datos
// sin perder seguridad de tipos. A diferencia de Object, no necesitamos
// hacer conversiones de tipo y el código es más fácil de entender.