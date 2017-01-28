package com.string.reverse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverveStringTest {

	@Test
	public void when_string_has_4_positions_must_reverse() {
		ReverveString reverser = new ReverveString("abcd");
		assertEquals("dcba", reverser.reverse());
	}
	
	@Test
	public void when_string_has_5_positions_must_reverse() {
		ReverveString reverser = new ReverveString("abcde");
		assertEquals("edcba", reverser.reverse());
	}
	
	@Test
	public void when_string_has_0_positions_returns_nothing() {
		ReverveString reverser = new ReverveString("");
		assertEquals("", reverser.reverse());
	}
	
	@Test
	public void when_string_has_1_positions_returns_itself() {
		ReverveString reverser = new ReverveString("a");
		assertEquals("a", reverser.reverse());
	}

	@Test
	public void when_string_has_deserat_character_in_the_middle_must_reverse() {
		ReverveString reverser = new ReverveString("ab𐐷dc");
		assertEquals("cd𐐷ba", reverser.reverse());
	}

	@Test
	public void when_string_has_deserat_character_in_the_beginning_must_reverse() {
		ReverveString reverser = new ReverveString("𐐷dc");
		assertEquals("cd𐐷", reverser.reverse());
	}

	@Test
	public void when_string_has_deserat_character_in_the_end_must_reverse() {
		ReverveString reverser = new ReverveString("ab𐐷");
		assertEquals("𐐷ba", reverser.reverse());
	}
}
