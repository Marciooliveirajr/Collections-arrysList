package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		
				Scanner ler = new Scanner(System.in);
				
				ArrayList<String> cores = new ArrayList<String>();
				
				System.out.println("\n\tDigite 5 cores: ");
				for(int i=0;i<5;i++) {
					System.out.println("\nDigite a cor número "+(i+1)+" : ");
					String cor = ler.nextLine();
					cores.add(cor);
				}
				
				Iterator<String> agreg = cores.iterator();
				
				
				System.out.println("\nLista de todas as cores: ");
				while(agreg.hasNext()) {
					System.out.println(agreg.next());
				}
				
				
				Collections.sort(cores);
				System.out.println("\nListas de cores Ordenadas");
				System.out.println("\n"+cores);

			}

		}

	