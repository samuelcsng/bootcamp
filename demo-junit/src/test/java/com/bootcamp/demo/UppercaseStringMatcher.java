package com.bootcamp.demo;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class UppercaseStringMatcher extends TypeSafeMatcher<String> {

  @Override
  protected boolean matchesSafely(String item) {
    return item.matches("[A-Z]+"); // check string value by regular expression
  }

  @Override
  public void describeTo(Description errorMsg) {
    errorMsg.appendText("String value should contain uppercase letter ONLY.");
  }

  // public static UppercaseStringMatcher of() {
  //   return new UppercaseStringMatcher();
  }

  public static UppercaseStringMatcher create() {
    return new UppercaseStringMatcher();
  }

}
