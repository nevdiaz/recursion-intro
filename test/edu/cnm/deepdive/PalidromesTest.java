package edu.cnm.deepdive;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalidromesTest {

  @Test
  public void isPalidrome() {
    assertTrue(Palidromes.isPalidrome("A man, a plan, a canal - Panama!"));
    assertFalse(Palidromes.isPalidrome("Not a palidrome"));
    assertTrue(Palidromes.isPalidrome("racecar"));
  }
}