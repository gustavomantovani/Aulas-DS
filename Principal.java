package exercise1;

public class Principal {

	public static void main(String[] args) {
		
		Filme filme[] = new Filme[7];
		
		filme[0] = new Filme();
		filme[0].titulo = "Os Vingadores";
		filme[0].duracaoEmMinutos = 142;
		
		filme[1] = new Filme();
		filme[1].titulo = "Hotel Transilvânia";
		filme[1].duracaoEmMinutos = 93;
		
		filme[2] = new Filme();
		filme[2].titulo = "Matrix";
		filme[2].duracaoEmMinutos = 136;
		
		filme[3] = new Filme();
		filme[3].titulo = "Joker";
		filme[3].duracaoEmMinutos = 122;
		
		filme[4] = new Filme();
		filme[4].titulo = "Donnie Darko";
		filme[4].duracaoEmMinutos = 113;
		
		filme[5] = new Filme();
		filme[5].titulo = "Clube da Luta";
		filme[5].duracaoEmMinutos = 139;
		
		filme[6] = new Filme();
		filme[6].titulo = "Gladiador";
		filme[6].duracaoEmMinutos = 155;
		
		System.out.println("Os filmes em cartaz são: ");
		for(int i = 0; i <= 6; i++) {
			
			System.out.println(filme[i].titulo);
			
		}
		
		System.out.println();
		
		System.out.println("Duração em Horas:");
		for(int i = 0; i <= 6; i++) {
			
			System.out.println(filme[i].exibirDuracaoEmHoras());
			
		}

	}

}
