public class Main {
    public static void main(String[] args) {

        System.out.println("Proyecto para aprender a hacer un Singleton");

        //intento instanciar un objeto con el constructor privado
        //esto es un error
        //Singleton miUnicaInstancia = new Singleton();

        // creo un objeto
        Singleton miUnicaInstancia = Singleton.getInstance();
        // le doy valor a los atributos
        miUnicaInstancia.setEdad(30);
        miUnicaInstancia.setNombre("Pepe");

        // creo otro objeto Singleton
        // como la única manera es con getInstance(), este método se encargará
        // de devolver el objeto creado anteriormente
        Singleton otraInstanciaSeraLaMisma = Singleton.getInstance();
        // puedo cambiar la edad
        // comprobar con el debug que los dos objetos:
        // miUnicaInstancia y otraInstanciaSeraLaMisma son el mismo
        otraInstanciaSeraLaMisma.setEdad(36);
    }
}