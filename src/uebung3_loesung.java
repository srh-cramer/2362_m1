void main() {
    // Aufgabe 4
    int age_a4 = 16;
    boolean withAdult = false;
    boolean hasVipTicket = false;

    boolean canEnter = age_a4 >= 16 || withAdult || hasVipTicket;
    IO.println("Darf in Film? " + canEnter);

    // Aufgabe 5
    int age_a5 = 16;
    double gradeAverage = 1.0;
    int workExperience = 3;
    boolean hasScholarship = false;

    boolean eligible = age_a5 >= 18 && !hasScholarship && (gradeAverage <= 2.0 || workExperience >= 2);
    IO.println("Berechtigt für Stipendium? " + eligible);
}