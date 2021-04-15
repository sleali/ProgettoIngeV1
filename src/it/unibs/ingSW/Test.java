/*
 * siamo consapevoli che andrebbe fatta una classe di test per ogni classe del programma, tuttavia, per comodità
 * e a causa dell'esiguo numero di metodi per classe, abbiamo deciso di utilizzare un unica classe di test
 * per l'intera versione 1 del progetto
 */

package it.unibs.ingSW;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test_isEqual_TransizioneN() 
	{
		TransizioneN tr1 = new TransizioneN(1);
		TransizioneN tr2 = new TransizioneN(2);
		TransizioneN tr3 = new TransizioneN(1);
		assertFalse(tr1.isEqual(tr2));
		assertTrue(tr1.isEqual(tr3));
	}
	
	void test_isEqual_PostoN() 
	{
		PostoN p1 = new PostoN(1);
		PostoN p2 = new PostoN(2);
		PostoN p3 = new PostoN(1);
		assertFalse(p1.isEqual(p2));
		assertTrue(p1.isEqual(p3));
	}

	void test_isEqual_ElementoN()
	{
		ElementoN e1 = new ElementoN(new PostoN(0), new TransizioneN(0), false);
		ElementoN e2 = new ElementoN(new PostoN(0), new TransizioneN(0), true);
		ElementoN e3 = new ElementoN(new PostoN(0), new TransizioneN(0), false);
		assertFalse(e1.isEqual(e2));
		assertTrue(e1.isEqual(e3));
	}
	
	void test_add_N()
	{
		Rete n = new Rete();
		ElementoN e1 = new ElementoN(new PostoN(0), new TransizioneN(0), false);
		ElementoN e2 = new ElementoN(new PostoN(0), new TransizioneN(0), false);
		
		assertTrue(n.add(e1));
		assertFalse(n.add(e1));
	}
	
	void test_size_and_remove_N()
	{
		Rete n = new Rete();
		ElementoN e1 = new ElementoN(new PostoN(0), new TransizioneN(0), false);
		
		assertEquals(n.size(), 0);
		n.add(e1);
		assertEquals(n.size(), 1);
		n.remove(0);
		assertEquals(n.size(), 0);
		
	}
	
	void test_getElementoN_N()
	{
		Rete n = new Rete();
		ElementoN e1 = new ElementoN(new PostoN(0), new TransizioneN(0), false);
		n.add(e1);
		ElementoN e2 = (ElementoN) n.getElemento(0);
		assertTrue(e1.isEqual(e2));
	}
	
	void test_isEqual_N()
	{
		Rete n1 = new Rete();
		Rete n2 = new Rete();
		ElementoN e1 = new ElementoN(new PostoN(0), new TransizioneN(0), false);
		n1.add(e1);
		n2.add(e1);
		assertTrue(n1.isEqual(n2));
	}
}
