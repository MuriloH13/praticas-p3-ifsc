package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setComprimento((float)30.5);
		cachorro.setCor("Preto");
		cachorro.setEco("Casa");
		cachorro.setNome("Fiona");
		cachorro.setNpatas(4);
		cachorro.setRaca("Dachshund");
		
		Gato gato = new Gato();
		
		gato.setComprimento((float)25.0);
		gato.setCor("Laranja");
		gato.setEco("Apartamento");
		gato.setNome("Lola");
		gato.setNpatas(4);
		gato.setRaca("Persa");
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getCor());
		System.out.println(cachorro.getEco());
		System.out.println(cachorro.getRaca());
		System.out.println(cachorro.getNpatas());
		System.out.println(cachorro.getComprimento());
		cachorro.latir();
		
		System.out.println("");
	
		System.out.println(gato.getNome());
		System.out.println(gato.getCor());
		System.out.println(gato.getEco());
		System.out.println(gato.getRaca());
		System.out.println(gato.getNpatas());
		System.out.println(gato.getComprimento());
		gato.miar();
	}

}
