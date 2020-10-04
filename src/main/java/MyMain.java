public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        
        int count = 0;
        for (int i = 0; i < 10000; i++){
            int numberSixes = 0; 
            for (int j = 0; j < 6; j++){
                if (Math.random() < 1.0/6.0){
                    numberSixes += 1; 
                }
            }
            if (numberSixes >= 1){
                count += 1;
            }

        }

        return (double)(count)/100.0;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int count = 0;
        for (int i = 0; i < 10000; i++){
            int numberSixes = 0; 
            for (int j = 0; j < 12; j++){
                if (Math.random() < 1.0/6.0){
                    numberSixes += 1; 
                }
            }
            if (numberSixes >= 2){
                count += 1;
            }

        }

        return (double)(count)/100.0;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int count = 0;
        for (int i = 0; i < 10000; i++){
            int numberSixes = 0; 
            for (int j = 0; j < 18; j++){
                if (Math.random() < 1.0/6.0){
                    numberSixes += 1; 
                }
            }
            if (numberSixes >= 3){
                count += 1;
            }

        }

        return (double)(count)/100.0;
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
