public class Break_Continue {
    public static void main(String[] args) {
        //code with the break condition
        // int i = 0;
        // while (i < 10) {
        //     System.out.println(i);
        //     i++;
        //     if (i == 4) {
        //         break; 
        //     }
        // }

        int i = 0;
        //code with the continue condition
        while (i < 10) {
            if(i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        
    }
}
