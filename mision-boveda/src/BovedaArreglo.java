public class BovedaArreglo<T> implements Boveda<T> {

    private T[] elementos;
    private int cantidad;

    @SuppressWarnings("unchecked")
    public BovedaArreglo() {
        elementos = (T[]) new Object[3];
        cantidad = 0;
    }

    @Override
    public void guardar(T elemento) {
        if (cantidad >= 3) {
            throw new IllegalStateException("La bóveda está llena");
        }

        elementos[cantidad] = elemento;
        cantidad++;
    }

    @Override
    public T sacar() {
        if (cantidad == 0) {
            throw new IllegalStateException("La bóveda está vacía");
        }

        cantidad--;

        T elemento = elementos[cantidad];
        elementos[cantidad] = null;

        return elemento;
    }

    @Override
    public boolean estaVacia() {
        return cantidad == 0;
    }

    @Override
    public int tamanio() {
        return cantidad;
    }
}