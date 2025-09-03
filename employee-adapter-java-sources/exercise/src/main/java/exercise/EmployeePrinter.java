package exercise;

import java.util.Collection;

public final class EmployeePrinter {
  private EmployeePrinter() {}
  public static void print(Collection<EmployeeAdaptor> employees) {
    for (EmployeeAdaptor e : employees) {
      System.out.println("ID=" + e.getId()
        + ", First=" + e.getFirstName()
        + ", Last=" + e.getLastName()
        + ", Email=" + e.getEmail());
    }
  }
}
