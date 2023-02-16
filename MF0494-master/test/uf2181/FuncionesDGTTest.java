package uf2181;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class FuncionesDGTTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testMediaPuntos() {
		int v[]= {3,3,3};
		assertEquals(3,FuncionesDGT.mediaPuntos(v));
		int h[]= {3,4,8};
		assertEquals(5,FuncionesDGT.mediaPuntos(h));
		int a[]= new int[0];
		assertThrows(ArrayIndexOutOfBoundsException.class,
			()->FuncionesDGT.mediaPuntos(a),
			"");
		}

	@Test
	void testMaximaTasaPermitida() {
		assertEquals(0.25,FuncionesDGT.maximaTasaPermitida("General",true));
		assertEquals(0.5,FuncionesDGT.maximaTasaPermitida("General",false));
		assertEquals(0.15,FuncionesDGT.maximaTasaPermitida("Novel",true));
		assertEquals(0.3,FuncionesDGT.maximaTasaPermitida("Novel",false));
	}

}
