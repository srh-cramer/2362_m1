void main() {
    char myChar = 'x';  // einfache Anführungszeichen
    String myString = "Java 'ist' toll!";  // doppelte Anführungszeichen

    int myAge = 20;
    String myAgeString = "Ich bin " + myAge + " Jahre alt.";
    IO.println(myAgeString);

    String name1 = "Ines";
    String name2 = "Karin";
    String name3 = "Jochen";
    String yearsOld = "Jahre alt";
    int age1 = 18;
    int age2 = 32;
    int age3 = 29;

    String namesAndAges = name1 + " ist " + age1 + " " + yearsOld +
            ", " + name2 + " ist " + age2 + " " + yearsOld + ", " +
            name3 + " ist " + age3 + " " + yearsOld + ".";
    IO.println(namesAndAges);

    String myName = "CatarinaCramer";
    // .length() gibt die Länge des Strings aus -> Datentyp int
    int myNameLength = myName.length();
    IO.println(myNameLength);

    // .equals() vergleicht, ob der Inhalt von 2 Strings gleich ist
    // -> Datentyp boolean (ja/nein)
    boolean isEqual = myName.equals("KatharinaKramer");
    IO.println(isEqual);

    // char hat keine Methoden:
    // int myCharLength = myChar.length();

}