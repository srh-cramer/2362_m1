void main() {
    String myName = "Rumpelstilzchen";
    // IO.readln() : Konsoleneingabe -> Sie sind gefragt!
    String guess = IO.readln("Rate meinen Namen: ");
    if (guess.equals(myName)){
        IO.println("Richtig!");
    }
    else {
        IO.println("Leider falsch ...");
    }
}