package com.mycompany.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class SameStartAndEndMatcher extends TypeSafeMatcher<String> {

	char matchChar;

	public SameStartAndEndMatcher() {
		matchChar = 0;

	}

	public SameStartAndEndMatcher(char matchChar) {

		this.matchChar = matchChar;
	}

	public void describeTo(Description description) {

		description.appendValue("Start and end characters are different");
	}

	@Override
	protected boolean matchesSafely(String value) {
		char start = value.charAt(0);
		char end = value.charAt(value.length() - 1);
		if (start == end) {
			if (matchChar != 0) {
				if (start == this.matchChar) {
					return true;
				}
			} else {
				return true;
			}
		}
		return false;

	}

}
