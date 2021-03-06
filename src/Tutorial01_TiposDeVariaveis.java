import java.util.Scanner;

public class Tutorial01_TiposDeVariaveis {
	
	//Variáveis de Instância (São criadas assim que os objetos são criados e destruídas quando os objetos são destruídos.)
	//São declaradas fora de métodos, construtores ou blocos
	//Possuem um valor para cada Objeto
	byte var1 = 127;	//8-bit integer
	short var2 = 32767;	//16bit integer
	long var3 = 9223372036854775807L; //64-bit integer
	float var4 = (float) Math.E; //32-bit floating point
	double var5 = Math.PI; //64-bit floating point
	boolean var6 = true;
	char var7 = 'c';
	
	//Variáveis de Classe
	//Possuem um único valor por classe
	//São declaradas como static
	public static double rand1 = Math.random(); 
	//Variáveis Finais não podem ser editadas
	public static final double RAND2 = Math.random(); //Convenciona-se usar letras maiúsculas para variáveis finais
	//Variáveis Privadas só podem ser acessadas através de getters e setters ou dentro da classe em que foram criadas
	private static double rand3 = Math.random();
	
	//Rand3 Getter
	public static double getRand3() {
		return rand3;
	}
	//Rand3 Setter
	public static void setRand3(double rand3) {
		Tutorial01_TiposDeVariaveis.rand3 = rand3;
	}
	//Método lerString
	public String lerString() {
		Scanner sc1 = new Scanner(System.in);
		//Variável Local (São destruídas ao fim do método) 
		//São declaradas dentro de métodos, construtores ou blocos
		//Esta variável é na verdade um objeto do tipo String
		String str1 = sc1.nextLine();
		return str1;
	}
}
