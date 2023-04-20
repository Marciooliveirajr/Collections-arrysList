package Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class exercicio1 {

	public static void main(String[] args) {
		
			      Scanner ler = new Scanner(System.in);
			        Set<Integer> conj = new LinkedHashSet<>();

			        System.out.println("Digite 10 valores inteiros :");

			        for (int i = 1; i <= 10; i++) {
			            System.out.print("Valor " + i + ": ");
			            int valor = ler.nextInt();
			            conj.add(valor);
			        }

			        System.out.println("\nElementos da coleção:");

			        Iterator<Integer> a = conj.iterator();
			        while (a.hasNext()) {
			            System.out.println(a.next());
			            
			        }
			        TreeSet<Integer> valoresOrdenados = new TreeSet<Integer>(conj);
			        System.out.println("Valores ordenados: " + valoresOrdenados);
			        			        
		}
 }
		


