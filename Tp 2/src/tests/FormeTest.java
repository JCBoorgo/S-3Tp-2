package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import javafx.scene.paint.Color;
import modele.Ovale;

import modele.Rectangle;
import modele.Triangle;

public class FormeTest {
	private Triangle t1;
	private Rectangle r1;
	private Ovale c1;

	@Before
	public void setUp() throws Exception {
		t1 = new Triangle(5, 4, 6);

		r1 = new Rectangle(7, 2);

		c1 = new Ovale(8, 1);

	}

	@Test
	public void testSetCouleur() {
		t1.setCouleur(Color.BLACK);
		assertTrue(t1.getCouleur() == Color.BLACK);
		r1.setCouleur(Color.BLUE);
		assertTrue(r1.getCouleur() == Color.BLUE);
		c1.setCouleur(Color.GREEN);
		assertTrue(c1.getCouleur() == Color.GREEN);
	}

}
