package co.edu.uelbosque.swii.calculadora;

import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTest {
  
	@Test
 	public void debeSumarCorrectamente() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Suma());
		Comando operacion = EncontrarComando.cmd("+");
		//Operaciones op = new Operaciones();
		double resultado = operacion.ejecutarOperacion(3.2, 5);
		double experado = 8.2;
		Assert.assertEquals(resultado, experado);
	}
	
	@Test(expectedExceptions=ComandoNoEncontradoException.class)
	public void noDebeEncontrarOperacionPotencia() throws ComandoNoEncontradoException {
		Comando operacion = EncontrarComando.cmd("^"); 
	}
	
	@Test
	public void laOperacionSumaExiste() throws ComandoNoEncontradoException {
		EncontrarComando.addOp(new Suma());
		Comando operacion = EncontrarComando.cmd("+");
		Assert.assertTrue(operacion instanceof Suma);
	}
}
