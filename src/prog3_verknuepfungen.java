void main() {
    boolean someBoolean = 5 == 5 && 7 < 9 && 10 > 8;
    IO.println(someBoolean);
    boolean someOtherBoolean = 5 == 5 && 7 != 7;
    IO.println(someOtherBoolean);
    boolean example = !(5 != 5);
    IO.println(example);

    String input = "";

    while (!input.equals("stop")){
        input = IO.readln("Schreibe 'stop' zum Beenden des Programms: ");
    }
    IO.println("Programm beendet.");
}