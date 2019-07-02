package tata.duoc.basedatos.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tata.duoc.basedatos.modelo.BaseDeDatos;
import tata.duoc.basedatos.modelo.Dato;

public class BaseDeDatosModificarTest {
	private BaseDeDatos basedatos;
	Dato dato;
	@Before
	public void setUp() throws Exception {
		this.basedatos = new BaseDeDatos();
		basedatos.agregar(new Dato("id1","nunca te rindas"));
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("test terminado");
	}

	@Test
	public void cuandoModificarIdEntoncesDataIgual() {
		this.dato = new Dato("id1","145min sin focus");
		this.basedatos.modificar(dato);
		List<Dato> lista = this.basedatos.listar();
		Iterator<Dato> ite = lista.iterator();
		while(ite.hasNext()) {
			if(this.basedatos.toString().equals(dato.toString())) {
				
			}
		}
	}

}
