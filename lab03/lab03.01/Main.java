import java.util.*;

class Main {
  public static void main(String[] argv) {
    Map<String, List<Person>> m = new HashMap<String, List<Person>>();

    String[] arr = {
      "office A", "John", "Doe",
      "office B", "John", "Brown",
      "office C", "Mary", "Jones",
      "office B", "Adam", "Rust",
      "office C", "Cindy", "Frost",
      "office A", "Kate", "Coe",
      "office A", "Bill", "Brown"
    };

    for (int i = 0; i < arr.length; i+=3) {
      String office = arr[i];
      String fname = arr[i+1];
      String lname = arr[i+2];
      List<Person> l = m.get(office);

      if (l == null) {
        l = new ArrayList<Person>();
      }

      l.add(new Person(fname, lname));

      m.put(office, l);
    }

    System.out.println(m);
  }
}

