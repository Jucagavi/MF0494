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
		
	}

}
