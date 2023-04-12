public class DoWhile {
    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);


        //for loop for Java
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        //nested loop
        for (int l = 0; l <= 2; l++){
            System.out.println("Outer: " + l); //executes 2 times

        //Inner loo
            for (int k = 0; k <= 3; k++) {
                System.out.println("Inner: " + k);
            }
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String n : cars)
            System.out.println(n);

        for (int a = 0; a < 10; a++) {
            if (i == 4) {
                break; //the break statement can also be used to jump out of a loop
            }
            System.out.println(a);
        }

        for (int c = 0; c < 10; c++) {
            if (c == 4) {
                continue;
            }
            System.out.println(c);
        }
    }
}
