package entities;

public class Bill {
  private char gender;
  private int beer;
  private int barbecue;
  private int softDrink;

  public Bill(char gender, int beer, int barbecue, int softDrink) {
    this.gender = gender;
    this.beer = beer;
    this.barbecue = barbecue;
    this.softDrink = softDrink;
  }

  public double feeding() {
    return 5.00 * beer + 7.00 * barbecue + 3.00 * softDrink;
  }

  public double ticket() {
    return gender == 'M' ? 10.00 : 8.00;
  }

  public double cover() {
    return feeding() < 30.00 ? 4.00 : 0.00;
  }

  public double total() {
    return feeding() + ticket() + cover();
  }
}
