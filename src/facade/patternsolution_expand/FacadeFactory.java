package facade.patternsolution_expand;

public class FacadeFactory {
	private FacadeFactory(){
		
	}
	
	public static FacadeApi createFacadeApi(){
		return new Facade();
	}
}
