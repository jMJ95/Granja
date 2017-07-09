public class Granja {
	public static void main(String[] args){
		Perro doqui;
		Gato misifu;
		Caballo cornelio;
		
		
		doqui = new Perro();
		misifu = new Gato();
		cornelio = new Caballo();
		
	
		doqui.nombre = "Doqui";
		misifu.nombre = "Misifu";		
		cornelio.nombre = "Cornelio";
		
		
		System.out.println("Ha nacido el perro "+doqui.nombre);
		doqui.ladrar();
			
		System.out.println("Ha nacido el Gato "+misifu.nombre);
		misifu.maullar();
					
		System.out.println("Ha nacido el Caballo "+cornelio.nombre);
		cornelio.relinchar();
	}
}
