package tata.duoc.basedatos.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tata.duoc.basedatos.modelo.BaseDeDatos;
import tata.duoc.basedatos.modelo.Dato;


public class BaseDeDatosListarTest {
	private BaseDeDatos basedatos;
	Dato dato;
	@Before
	public void setUp() throws Exception {
		this.basedatos = new BaseDeDatos();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cuandoListarNotNullEntoncesSize3(){
		basedatos.agregar( new Dato("112", "algo de info"));
		basedatos.agregar(new Dato("2123","algo de info 2"));
		basedatos.agregar(new Dato("3123","algo de info 3"));
		int lista = this.basedatos.listar().size();
		assertTrue("Es "+lista+" y debiera ser 3", lista==3);
	}
	@Test
	public void cuandoListarNotNullyVacioSize0() {
		ArrayList<Dato> resultado = this.basedatos.listar();
		assertTrue("Es "+resultado+" y debe ser 0",resultado.size()==0);
	}

}
