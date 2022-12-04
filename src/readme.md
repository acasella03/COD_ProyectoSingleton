# Tarea Singleton

El propósito del proyecto es conocer el funcionamiento 
de los diseños de patrones, como el Singleton.

El singleton es el diseño de patrón más sencillo que 
permite restringir la creación de objetos pertenecientes
a una clase o el valor de un tipo a un único objeto.

Su intención consiste en garantizar que una clase solo 
tenga una instancia y proporcionar un punto de acceso 
global a ella.

Diagrama UML de una clase que implementa el patrón singleton:
![Imagen](https://upload.wikimedia.org/wikipedia/commons/f/fb/Singleton_UML_class_diagram.svg)

El patrón singleton provee una única instancia global gracias a que:

* La propia clase es responsable de crear la única instancia. Por medio de su método constructor.
* Permite el acceso global a dicha instancia mediante un método de clase.
* Declara el constructor de clase como privado para que no sea instanciable directamente.
* Al estar internamente autoreferenciada, en lenguajes como Java, el recolector de basura no actúa.
