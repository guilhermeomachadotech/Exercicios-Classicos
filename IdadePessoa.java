import java.util.Scanner;
public class IdadePessoa {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int idade, idadeMaior=-1, idadeMenor=1000, i=1 ;
		double media, somaIdades=0;
		do {
			System.out.println("Digite a idade do "+i+"� usu�rio:");
			idade=ler.nextInt();
			somaIdades=somaIdades+idade;
			if(idade>idadeMaior) {
				idadeMaior=idade;
			}else if(idade<idadeMenor){
				idadeMenor=idade;
			}
			i++;
		}while (i<=10);
		media=somaIdades/10;
		System.out.println ("A m�dia de idades � "+media);
		System.out.println("A idade mais velha � "+idadeMaior+" anos, e a idade mais novo � "+idadeMenor+" anos");
		ler.close();
	}
}
