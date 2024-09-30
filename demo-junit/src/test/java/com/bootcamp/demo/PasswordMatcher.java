package com.bootcamp.demo;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class PasswordMatcher extends TypeSafeMatcher<String> {
  @Override
  protected boolean matchesSafely(String item) {
    // 8 - 16 characters
    // contains at least one Capital letter
    // contains at least one small letter
    // contains at least one number
    // contains at least one special character !@#$
    // return item.matches("^(A-Z)()()()[A-Z0-9]{8,16}$"); //
    return item.matches("^(A-Z)()()()[A-Z0-9]{8,16}$"); //

    // ()[]{} regular expression
  }

  @Override
  public void describeTo(Description errorMsg) {
    errorMsg.appendText("Invalid Password Format.");
  }

  public static PasswordMatcher create() {
    return new PasswordMatcher();
  }

}
