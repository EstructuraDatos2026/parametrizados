**public interface Boveda<T> {**



&#x20;   **/\*\* Agrega un elemento a la bóveda. \*/**

&#x20;   **void guardar(T elemento);**



&#x20;   **/\*\* Quita y devuelve el último elemento guardado. \*/**

&#x20;   **T sacar();**



&#x20;   **/\*\* Indica si la bóveda no tiene ningún elemento. \*/**

&#x20;   **boolean estaVacia();**



&#x20;   **/\*\* Devuelve cuántos elementos hay guardados actualmente. \*/**

&#x20;   **int tamanio();**

**}**

