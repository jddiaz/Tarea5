package PilasConColas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------Cola------");
		  Cola cola = new Cola();
		  cola.encolar("A");
		  cola.encolar("B");
		  cola.encolar("C");
		  cola.encolar("D");
		  
		  System.out.println("Esta vacia la cola?:" + cola.vacia());
		  System.out.println("Tamaño de la cola:" + cola.size());
		  
		  System.out.println(cola.frente());
		  cola.desencolar();
		  System.out.println(cola.frente());
		  cola.desencolar();
		  System.out.println(cola.frente());
		  cola.desencolar();
		  System.out.println(cola.frente());
		  cola.desencolar();
		  
		  System.out.println("Esta vacia la cola?:" + cola.vacia());

	}

}
