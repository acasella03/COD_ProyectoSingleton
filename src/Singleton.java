/**
 * Solo una instancia
 */
public class Singleton {
    /**
     * Atributo para comprobar que siempre es el mismo objeto
     */
    private String nombre;
    private int edad;

    // esta va a ser nuestra unica instancia
    private static Singleton instance = null;

    /**
     * Constructor bloqueado con private
     */
    private Singleton() {
    }

    /**
     * Segun exista o no, ya el objeto lo instanciamos o cambiamos los datos
     *
     * @return la instancia. Si no existe la crea primero
     */
    public static Singleton getInstance() {
        // compruebo si ya está creada
        if (instance == null) {
            // como no está creada, la creo
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new Singleton();
        }
        // devuelvo la instancia
        return instance;
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
