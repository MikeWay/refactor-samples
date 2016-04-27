package com.mycompany.matchers;

public class MatchFactory {
	
	private MatchFactory(){}
	
	public static SameStartAndEndMatcher sameStartAndEndCharacter(){
		return new SameStartAndEndMatcher();
	}
	
	public static SameStartAndEndMatcher sameStartAndEndCharacter(char c){
		return new SameStartAndEndMatcher(c);
	}	

}
