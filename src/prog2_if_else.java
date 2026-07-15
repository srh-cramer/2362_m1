void main() {
    //Skript Beispiele
//    int age = 10;
//    if (age >= 18){
//        IO.println("Die Person ist volljährig.");
//    }

    boolean isSunday = true;
    if (isSunday) {
        IO.println("Es ist Sonntag");
    }

    //Skript Übung 1
    float price = 0.0f;
    if (price == 0.0) {
        IO.println("Artikel ist kostenlos");
    }

    int age = 26;
    boolean isAdult;
    if (age >= 18) {
        isAdult = true;
    } else {
        isAdult = false;
    }
    // Ausgabe des Wertes von isAdult auf Konsole:
    IO.println("Ist die Person erwachsen? " + isAdult);

    int februaryDays;
    boolean isLeapYear = false;

    if (isLeapYear) {    //hat isLeapYear den Wert true?
        februaryDays = 29;
    } else {
        februaryDays = 28;
    }
    IO.println(februaryDays);


    int a = 3;
    if (a == 3) {
        IO.println("a ist 3!");
    } else if (a < 3) {
        IO.println("a ist kleiner als 3!");
    } else {
        IO.println("a ist größer als 3!");
    }

}
