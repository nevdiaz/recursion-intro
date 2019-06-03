package edu.cnm.deepdive;

public class Palidromes {

  public static boolean isPalidrome(String toCheck) {



    toCheck = toCheck.toLowerCase();
    toCheck = toCheck.replaceAll("[\\W_]+", "");

    return toCheck.length() <= 1
        || (
        toCheck.charAt(0) == toCheck.charAt(toCheck.length() - 1)
            && isPalidrome(toCheck.substring(1, toCheck.length() - 1)));
  }
}
