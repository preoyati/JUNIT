package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	//AACD => CD, ACD => CD
	@Test
	public void testTruncateAInFirst2Position_Ainfirst2Position() {
		
		
		/*String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);
		*/
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		
	}
	@Test
	public void testTruncateAInFirst2Position_Ainfirstposition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		
	}
	//ABCD => false, ABAB => true,  AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenarioForTwoLetter() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenarioForOnlyOneLetter() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	
	}

}
