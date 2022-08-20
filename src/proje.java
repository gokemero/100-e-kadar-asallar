public class proje {
    public static void main(String[] args) {
        int a = 2;
        System.out.print("2 3 5 7 ");
        while (a<=100){
            if(a%2 != 0 && a%3 != 0 && a%5 != 0 && a%7 !=0) System.out.print(a+" ");
            a++;
        }
    }
}