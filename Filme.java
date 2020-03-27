package exercise1;

public class Filme {
	
	String titulo;
	int duracaoEmMinutos;
	
	 public String exibirDuracaoEmHoras(){
		 
		 int[] duracaoEmHoras = {duracaoEmMinutos/60, duracaoEmMinutos%60};
		 return titulo+" => "+duracaoEmHoras[0]+":"+duracaoEmHoras[1];
		 
	 }

}
