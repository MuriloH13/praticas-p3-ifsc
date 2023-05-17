package Ex10;

public class Ex10 {

	public static void main(String[] args) {

		Animal Name = new Animal();
		
		Name.Familia = "Alligatoridae";
		Name.NomeCientifico = "Caiman latirostris";
		Name.Reino = "Animal";
		
		String[] VetorPopName = new String[5];
		VetorPopName[0] = "Crocodilo";
		VetorPopName[1] = "Aligátor";
		VetorPopName[2] = "Aruá";
		VetorPopName[3] = "Arurá";
		VetorPopName[4] = "Jacaré-de-óculos";
		
		Name.NomePop = VetorPopName;
		
		System.out.println("Familia: " + Name.Familia);
		System.out.println("Nome científico: " + Name.NomeCientifico);
		System.out.println("Reino: " + Name.Reino);
		System.out.println("5 nomes populares:");
		for (int i = 0; i < 5; i++) {
			System.out.println(Name.NomePop[i]);
			
		}
	}
}
		
