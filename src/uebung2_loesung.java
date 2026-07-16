void main() {

  // Aufgabe 3
  int soldCars = 50;  //diesen Wert nach Belieben verändern
  int bonusDays;

  if (soldCars < 20){
    bonusDays = 0;
  }
  else if (soldCars < 60){
    bonusDays = 1;
  }
  else {
    bonusDays = 2;
  }
  IO.println("Bonus-Tage für " + soldCars + " verkaufte Autos: " + bonusDays);

  //-----------------------------------------------------------------------------
  // Aufgabe 4
  int sales = 70000; //diesen Wert nach Belieben verändern
  double bonusPercentage;

  if (sales > 100000){
    bonusPercentage = 10.0;
  }
  else if (sales > 50000){
    bonusPercentage = 5.0;
  }
  else {
    bonusPercentage = 2.5;
  }
  double bonusSalary = sales / 100.0 * bonusPercentage;
  IO.println("Bonus für " + sales +"€ Umsatz: " + bonusSalary + "€");

  //-----------------------------------------------------------------------------
  // Aufgabe 5
  int age_a5 = 12; //diesen Wert nach Belieben verändern
  boolean isWeekend = true; //diesen Wert nach Belieben verändern
  int price_a5;

  if (age_a5 < 6){
    price_a5 = 0;
  }
  else if (age_a5 <= 16){
    if (isWeekend){
      price_a5 = 12;
    }
    else {
      price_a5 = 10;
    }
  }
  else {
    if (isWeekend){
      price_a5 = 20;
    }
    else {
      price_a5 = 15;
    }
  }
  IO.println("Preis für Alter " + age_a5 + " und Wochenende " + isWeekend + ": " + price_a5);

  //-----------------------------------------------------------------------------------
  // Aufgabe 6
  int age_a6 = 12;            //diesen Wert nach Belieben verändern
  boolean isDisabled = true;  //diesen Wert nach Belieben verändern
  boolean isMonday = true;    //diesen Wert nach Belieben verändern
  double price_a6;  //double, da mit Prozentwerten gerechnet wird

  if (age_a6 < 6){
    price_a6 = 0.0;
  }
  else if (age_a6 <= 16){
    price_a6 = 15.0;
  }
  else{
    price_a6 = 20.0;
  }
  //20 Prozent Rabatt für Behinderte, Variable price_a6 wird mit sich selbst überschrieben:
  if (isDisabled){
    price_a6 = price_a6 * 0.8;
  }
  //2€ Abzug am Montag:
  if (isMonday){
    price_a6 = price_a6 - 2.0;
  }

  IO.println("Preis für Alter " + age_a6 + ", Behinderung " + isDisabled + ", Montag " + isMonday + ": " + price_a6);
}