import java.util.Scanner;
public class NumPrimo {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int result, num,i=1,qtdd=0;
		System.out.println("Digite o n�mero para saber se ele � primo:");
		num=ler.nextInt();
		do {
			result=num%i;
			if(result==0) {
				qtdd=qtdd+1;
			}
			i++;
		}while(i<=num);
		if(qtdd==2) {
			System.out.println(num+" � primo");
		}else {
			System.out.println(num+" n�o � primo.");
		}
		ler.close();
	}
}
