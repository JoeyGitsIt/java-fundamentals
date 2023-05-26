package com.joey.takehome;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Map;
import java.util.Map.Entry;

public class App {
  public static HashMap<Integer, Sandwich> menu = new HashMap<Integer, Sandwich>();
  public static List<Sandwich> menu1 = new ArrayList<Sandwich>();

  public static void main(String[] args) {
    createMenu();
    System.out.println("----------------------");
    createOrder(2, "Joey");
    System.out.println("----------------------");
    createGroupOrder(new int[] { 1, 2, 3, 4, }, "Alex", true);
    System.out.println("----------------------");
    glutenFreeOption();
    System.out.println("----------------------");
    healthyOption(900);
    System.out.println("----------------------");
    allergyCheck("mozzarella cheese");

  }

  public static void createMenu() {
    Sandwich sandwich1 = new Sandwich("BLT", 12.50, 925, false, new Date(4102462799L),
        new String[] { "Bacon", "lettuce", "tomato", "mayo" });
    Sandwich sandwich2 = new Sandwich("PBJ", 7.35, 822, true, new Date(0L),
        new String[] { "peanut butter", "grape jelly", "honey" });
    Sandwich sandwich3 = new Sandwich("Grilled Cheese", 8.25, 889, false, new Date(0L),
        new String[] { "mozzarella cheese", "provolone cheese", "cheddar cheese", "jack cheese" });
    Sandwich sandwich4 = new Sandwich("Grilled Chicken", 9.25, 713, false, new Date(0L),
        new String[] { "chicken", "lettuce", "tomato", "pickles", "guacamole" });
    Sandwich sandwich5 = new Sandwich("Meatball", 12.50, 934, false, new Date(0L),
        new String[] { "beef", "parmesan cheese", "mozzarella cheese", "olive oil", "marinara sauce" });
    Sandwich sandwich6 = new Sandwich("Egg Salad", 10.15, 1100, false, new Date(1751601600L),
        new String[] { "eggs", "mayo", "mustard", "green onion", "celery", "dill" });
    Sandwich sandwich7 = new Sandwich("Ruben", 12.50, 855, false, new Date(1685851200),
        new String[] { "corned beef", "swiss cheese", "sauerkraut", "Thousand Island dressing" });
    Sandwich sandwich8 = new Sandwich("Turkey Club", 11.25, 795, false, new Date(0L),
        new String[] { "turkey", "bacon", "lettuce", "cheddar cheese", "tomato", "pickles", "mayo" });
    Sandwich sandwich9 = new Sandwich("Cuban", 10.50, 750, false, new Date(1703998800L),
        new String[] { "ham", "roast pork", "swiss cheese", "pickles", "mustard" });
    Sandwich sandwich10 = new Sandwich("Veggie", 9.25, 615, true, new Date(0L), new String[] { "cucumber", "tomato",
        "spinach", "lettuce", "bell pepper", "carrots", "sprouts", "guacamole", "hummus" });

    menu1.add(0, sandwich1);
    menu1.add(1, sandwich2);
    menu1.add(2, sandwich3);
    menu1.add(3, sandwich4);
    menu1.add(4, sandwich5);
    menu1.add(5, sandwich6);
    menu1.add(6, sandwich7);
    menu1.add(7, sandwich8);
    menu1.add(8, sandwich9);
    menu1.add(9, sandwich10);

    System.out.println("Menu:");
    menu.values().forEach(
        sandwich -> System.out.println(
            ("name: " + sandwich.name + "\n" + "cost: " + sandwich.cost + "\n" + "calories: " + sandwich.calories
                + "\n" + "ingredients: "
                + Arrays.toString(sandwich.getIngredientsArray()).replaceAll("[\\[\\]]", ""))));
  }

  public static Order createOrder(int menuNumber, String customerName) {
    Order order = new Order(customerName, menu.get(menuNumber).cost);

    System.out.println("Order");
    System.out.println("Name: " + order.getCustomerName() + " \nTotal: $" + String.format("%.2f", order.getTotal()));
    return order;
  }

  public static Order createGroupOrder(int[] orderedSandwiches, String customerName, boolean groupOrder) {
    double totalCost = 0;

    if (groupOrder) {
      for (int menuItem : orderedSandwiches) {
        totalCost += menu.get(menuItem).getCost();
      }
    }

    Order order = new Order(customerName, totalCost);

    System.out.println("Group Order");
    System.out.println("Name: " + order.getCustomerName() + " \nTotal: $" + String.format("%.2f", order.getTotal()));
    return order;
  }

  public static Map<Integer, Sandwich> glutenFreeOption() {
    Map<Integer, Sandwich> glutenFreeSandwiches = menu.entrySet().stream()
        .filter(sandwich -> sandwich.getValue().isGlutenFree == true)
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));

    System.out.println("Gluten Free Options:");
    glutenFreeSandwiches.values().forEach(v -> System.out.println(v.name));

    return glutenFreeSandwiches;
  }

  public static Map<Integer, Sandwich> healthyOption(int calories) {
    Map<Integer, Sandwich> healthySandwiches = menu.entrySet().stream()
        .filter(sandwich -> sandwich.getValue().calories < calories)
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));

    System.out.println("Healthy Options:");
    healthySandwiches.values().forEach(v -> System.out.println(v.name));

    return healthySandwiches;
  }

  public static Map<Integer, Sandwich> allergyCheck(String ingredient) {
    Map<Integer, Sandwich> allergenFreeSandwiches = menu.entrySet().stream()
        .filter(sandwich -> Arrays.asList(sandwich.getValue().getIngredientsArray()).contains(ingredient) == false)
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));

    System.out.println("Allergen Free Options:");
    allergenFreeSandwiches.values().forEach(v -> System.out.println(v.name));

    return allergenFreeSandwiches;
  }
}
