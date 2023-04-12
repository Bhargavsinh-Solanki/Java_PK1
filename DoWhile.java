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

    }
}
