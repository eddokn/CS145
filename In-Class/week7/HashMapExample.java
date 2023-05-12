import java.util.*;

/*["dog","cat"];
* array[1] -> cat
*/
public class HashMapExample {

  public static void main(String[] args){

    HashMap<String, String> dictionary = new HashMap<String, String>();
    dictionary.put("dog", "creature with an excellent sniffer");
    dictionary.put("cat", "nap architect with a mysterious agenda");

    HashMap<String, Integer> cityPopulations = new HashMap<String, Integer>();
    cityPopulations.put("London", 8982000);
    cityPopulations.put("Berlin", 3645000);
    cityPopulations.put("Oslo", 634293);
    cityPopulations.get("London"); // 8982000

    // maps a string representing a country, to a string representing its capital
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");

    String englandsCapital = capitalCities.get("England"); // London
    capitalCities.remove("England");

    System.out.println("Germany's capital is: " + capitalCities.get("Germany"));

    // iterate over every item
    for (String country : capitalCities.keySet()) {
      System.out.println("key: " + country + " value: " + capitalCities.get(country));
    }

    Set<String> countryKeys = capitalCities.keySet();

    if(capitalCities.containsKey("USA")){
      System.out.println("USA is a key in capitalCities");
    }

    HashMap<Person, Animal> favAnimals = new HashMap<Person, Animal>();
    Person john = new Person("john");
    Animal cow = new Cow("Betsy");
    favAnimals.put(john, cow);
    favAnimals.get(john).makeSound();
  }
}
