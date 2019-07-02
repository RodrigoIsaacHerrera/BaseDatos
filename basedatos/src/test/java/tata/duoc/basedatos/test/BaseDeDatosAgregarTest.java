package tata.duoc.basedatos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tata.duoc.basedatos.modelo.BaseDeDatos;
import tata.duoc.basedatos.modelo.Dato;

public class BaseDeDatosAgregarTest {
	private BaseDeDatos basedatos;
	Dato dato;
	@Before
	public void setUp() throws Exception {
		this.basedatos = new BaseDeDatos();
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("prueba terminada correctamente");
	}
	@Test
	public void cuandoDatoNullEntoncesReturnFalse() {
		//dato == null || dato.getId() == null || dato.getId().length() <= 1
		String validador = this.basedatos.agregar(new Dato(null,null))?"true":"false";
		assertTrue("Es "+validador+" deberia ser false", validador=="false");
	}
	@Test
	public void cuandoIdNullEntoncesReturnFalse() {
		//dato == null || dato.getId() == null || dato.getId().length() <= 1
		String validador = this.basedatos.agregar(new Dato(null,"tiene datos"))?"true":"false";
		assertTrue("Es "+validador+" deberia ser false", validador=="false");
	}
	@Test
	public void cuandoLengthIdMenorOIgual1EntoncesReturnFalse() {
		//dato == null || dato.getId() == null || dato.getId().length() <= 1
		String validador = this.basedatos.agregar(new Dato("1","tiene datos"))?"true":"false";
		assertTrue("Es "+validador+" deberia ser false", validador=="false");
	}
	@Test
	public void cuandoDatoEsCorrectoReturnTrue() {
		//dato == null || dato.getId() == null || dato.getId().length() <= 1
		String validador = this.basedatos.agregar(new Dato("123","tiene datos"))?"true":"false";
		assertTrue("Es "+validador+" deberia ser false", validador=="true");
	}
	
}
