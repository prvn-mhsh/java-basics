package basics.statements.conditional;

public class elseif_example {
  public static void main(String[] args) {
    int age = 22;

    if (age < 13) {
      System.out.println("You are just child now.");
    } else if (age >= 13 && age < 20) {
      System.out.println("You are a teenager.");
    } else if (age >= 20 && age < 65) {
      System.out.println("You are an adult.");
    } else {
      System.out.println("You are a senior citizen.");
    }
  }
}

//javac basics/statements/conditional/elseif_example.java && java basics.statements.conditional.elseif_example