package tata.duoc.basedatos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tata.duoc.basedatos.modelo.BaseDeDatos;
import tata.duoc.basedatos.modelo.Dato;

public class BaseDeDatosEliminarTest {
	private BaseDeDatos basedatos;
	Dato dato;
	@Before
	public void setUp() throws Exception {
		this.basedatos = new BaseDeDatos();
		basedatos.agregar( new Dato("112", "algo de info"));
		basedatos.agregar(new Dato("2123","algo de info 2"));
		basedatos.agregar(new Dato("3123","algo de info 3"));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("prueba terminada correctamente");
	}
	@Test
	public void cuandoEliminarEntoncesSize2() {
		this.basedatos.eliminar("112");
		int largo = this.basedatos.listar().size();
		assertEquals(2, largo);
	}



}
