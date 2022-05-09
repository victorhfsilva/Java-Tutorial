
public class Tutorial01_Main {
	
	public static void main(String[] args) {
		//Cria objeto 1
		Tutorial01_TiposDeVariaveis obj1 = new Tutorial01_TiposDeVariaveis();
		//Edita uma variável do objeto
		obj1.var1=-128;
		System.out.println("obj1.var1: "+obj1.var1);
		//Edita uma variável da classe
		System.out.println("obj1.rand1: "+obj1.rand1);
		obj1.rand1 = 12.4141;
		System.out.println("obj1.rand1: "+obj1.rand1+"\n");
		
		//Observe como o valor de rand1 do objeto obj1 é o mesmo do obj2, enquanto o de var1 é resetado para o seu valor inicial
		Tutorial01_TiposDeVariaveis obj2 = new Tutorial01_TiposDeVariaveis();
		System.out.println("obj2.var1: "+obj2.var1);
		System.out.println("obj2.rand1: "+obj2.rand1+"\n");
		
		//Já o valor do rand3 só pode ser acessado através de getters e editado através de setters
		System.out.println("obj1.rand3: "+obj1.getRand3());
		obj1.setRand3(4.1231);
		System.out.println("obj1.rand3: "+obj1.getRand3());
		System.out.println("obj2.rand3: "+obj2.getRand3());
		
		//Ler String
		String str1 = obj1.lerString();
		System.out.println("String:"+"\t"+str1);
		
	}
}
