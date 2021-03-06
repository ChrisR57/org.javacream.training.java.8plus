package org.javacream.training.java.plus8.people;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		Person person = new Person("Sawitzki", "Rainer");
		person.setAddress(new Address("M�nchen", "Marienplatz"));
		Assert.assertEquals("city=M�nchen, street=Marienplatz", person.getShortAddress());
		Address address = person.getNormalizedAddress();
		Assert.assertEquals("M�NCHEN", address.getCity());
		Assert.assertEquals("marienplatz", address.getStreet());
	}
	@Test
	public void testUniversity() {
		University university = new University("LMU");
		university.setAddress(new Address("M�nchen", "Marienplatz"));
		Assert.assertEquals("city=M�nchen, street=Marienplatz", university.getShortAddress());
		Address address = university.getNormalizedAddress();
		Assert.assertEquals("M�NCHEN", address.getCity());
		Assert.assertEquals("alexanderplatz", address.getStreet());
		Assert.assertEquals("M�nchen", university.getCity());
		Assert.assertEquals("Alexanderplatz", university.getStreet());
	}
}
