package com;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.Matcher;

public class UpperCaseStringMatcher extends TypeSafeMatcher<String>{
  
  @Override
  protected boolean matchesSafely(String item) {

    return item.matches("[A-Z]+"); // regex 

    
  }

  @Override
  public void describeTo(Description description){
    description.appendText("A String containing only uppper string.");


  }


  public static Matcher<String> containsUpercaseOnly(){
    return new UpperCaseStringMatcher();
  }
}
