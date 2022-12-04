/**
 * Solo una instancia
 */
public class Singleton {
    /**
     * Atributo para comprobar que siempre es el mismo objeto
     */
    private String nombre;
    private int edad;

    /**
     * Constructor bloqueado con private
     */
    private Singleton() {
    }

    /**
     * Para devolver nombre de una persona
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Para asignar nombre de la persona
     *
     * @param nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Para devolver edad de una persona
     *
     * @return edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Para asignar edad de la persona
     *
     * @param edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
