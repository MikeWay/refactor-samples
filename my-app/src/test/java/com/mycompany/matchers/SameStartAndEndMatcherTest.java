package com.mycompany.matchers;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;

import static org.hamcrest.core.IsNot.not;

import static com.mycompany.matchers.MatchFactory.sameStartAndEndCharacter;

import org.junit.Before;
import org.junit.Test;

public class SameStartAndEndMatcherTest {



	@Test
	public void test() {
		assertThat("Mary had a M", sameStartAndEndCharacter('M'));
		assertThat("Mary had a M", sameStartAndEndCharacter());
		assertThat("Mary had a M", not(sameStartAndEndCharacter('A')));
		assertThat("Mary had a fish", not(sameStartAndEndCharacter()));
		assertThat("Mary had a X", not(sameStartAndEndCharacter()));
	}



}
