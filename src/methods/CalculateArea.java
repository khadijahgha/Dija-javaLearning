package methods;

public class CalculateArea {
    public static int calculateArea(int width,int length){

        return width * length;
    }
    public static void main(String[] args){
        int area = calculateArea(8,6);
        System.out.println(area);
    }
}
