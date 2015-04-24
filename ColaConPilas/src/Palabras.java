import java.util.Stack;


public class Palabras {
	
	private Stack<String> pila1 = new Stack<String>();
	private Stack<String> pila2 = new Stack<String>();
	
	public void palabra(String cadena){
		
		pila1.push(cadena);		
	}
	
	public void palabra2(String cadena2){
		if (pila1.isEmpty()){
			
			while (!pila2.isEmpty()){
				
			}
			
		}
		System.out.println(pila2.pop()); 
			
			

	}
	
}
	