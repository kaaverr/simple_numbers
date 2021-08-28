package max.edu;

public class Main {

public static boolean isSimple(int number){
    boolean result=true;
    for (int i = 2; i <number; i++) {
        if (number % i == 0 ){
            return false;
        }
    }
    return result;
}

    public static void main(String[] args) {
        System.out.println(isSimple(16));
    }
}
