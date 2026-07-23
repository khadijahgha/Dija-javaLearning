package arraylists;

public class Country {
    public static void main(String[] args){
        java.util.ArrayList<String> countries = new java.util.ArrayList<>();  // to print the countries
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();  // to calculate the total numbers

        countries.add("Ghana");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Nigeria");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int total =0;




        for(int i =0; i < numbers.size(); i++){
            total += numbers.get(i);
        }

        System.out.println(countries);
        System.out.println(countries.get(2));
        System.out.println(countries.size());

        System.out.println(total);
    }
}
