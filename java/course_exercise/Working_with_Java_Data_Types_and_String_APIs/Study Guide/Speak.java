class Speak {
    String language = "Englinsh";

    Speak() {
        System.out.println("This is the constructor speaking " + language);
    }

    public static void main(String[] args) {
        Speak speaker = new Speak();
    }
}