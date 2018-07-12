import org.junit.Assert;
import org.junit.Test;

public class UtilidadesTest {
	
	@Test
	public void testConcatenar() {
		//GIVEN - Instanciar la clase a probar
		Utilidades utilidades = new Utilidades();
		//WHEN - Ejecutar el metodo a probar
		String resultado = utilidades.concatenar("Hola", "Sopra");
		//THEN - Validaciones
		Assert.assertEquals("Las cadenas están separadas","HolaSopra", resultado);
		
	}
	
	@Test
	public void testConcatenarFallo() {
		//GIVEN - Instanciar la clase a probar
		Utilidades utilidades = new Utilidades();
		//WHEN - Ejecutar el metodo a probar
		String resultado = utilidades.concatenar("Hola", "Sopra");
		//THEN - Validaciones
		Assert.assertEquals("las cadenas estan separadas","HolaSopra", resultado);
		
	}
	
	@Test
	public void testConcatenarError() {
		//GIVEN - Instanciar la clase a probar
		Utilidades utilidades = new Utilidades();
		//WHEN - Ejecutar el metodo a probar
		String resultado = utilidades.concatenar(null, "Sopra");
		//THEN - Validaciones
		Assert.assertEquals("la BBDD no esta disponible, intentelo mas tarde","HolaSopra", resultado);
		
	}

}
