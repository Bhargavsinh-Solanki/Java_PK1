public class Array {
    public static void main(String[] args) {

        //to declare an array, define the variable with square brackets:
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        System.out.println(cars[0]); //Output Volvo

        //Array length
        System.out.println(cars.length);
        

        //Loop through an array with For-each
        //for (type variable : arrayname) { }

        String[] autos = {"Audi", "Mercedes", "Porsche", "VW"};
        for (String i : autos) {
            System.out.println(i);
        }

// Multidimensional Array

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}}; //array with two arrays as elements
        //myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); //output 7


//Loop through multidimensional Array

        int[][] hisNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int a = 0; a < hisNumbers.length; ++a) {
            for (int b = 0; b < hisNumbers[a].length; ++b){
                System.out.println(hisNumbers[a][b]);
            }
        } 
    }
}
