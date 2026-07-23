package loopsandarrays;

public class LoopsAndArrays {
    public static void main(String[] args) {
        int[] numbers={
                10,
                20,
                30,
                40,
                50
        };

        String[] names={
                "Ali",
                "John",
                "Mary",
                "Sarah"
        };

        int[] score ={
                80,
                75,
                90,
                60,
                85
        };

        int total=0;

        // to print out numbers
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);

        }
        // to print out the names
        for (String name: names){
            System.out.println(name);
        }

        //to print out the total score
        for(int i = 0; i < score.length; i++){
            total = total + score[i]; // or total+= score[i];
            System.out.println("current total= " + total);
        }
        System.out.println("Final total = " +total);
    }
}
