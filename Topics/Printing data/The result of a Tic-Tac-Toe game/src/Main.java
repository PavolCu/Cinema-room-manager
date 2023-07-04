class Main {
    public static void main(String[] args) {
        char one = 'X';
        char two = 'O';
        String three = " ";
        System.out.printf("%c" + "%s" + "%c" + "%s" + "%c" + "%n", two, three, one, three, one);
        System.out.printf("%c" + "%s" + "%c" + "%s" + "%c" + "%n", two, three, one, three, two);
        System.out.printf("%c" + "%s" + "%c" + "%s" + "%c" + "%n", one, three, two, three, one);

    }
}