public class SplitNumberIntoPowerOfTwo {

    private static boolean trigger = true;

    private static void splitNumberIntoPowerOfTwo(int N){

        if(N <= 0){
            System.out.println("This number can't be splitted into power of 2");
            return;
        }

        if(trigger){
            System.out.print(N + " = ");
            trigger = false;
        }

        int power = 0, number = 0;

        while(N >= number){

            power++;
            number = (int) Math.pow(2, power);

            if(number > N){
                power--;
                System.out.print("2^" + power);
                break;
            }
        }

        number = (int) Math.pow(2, power);

        if(N != number) {
            System.out.print(" + ");
            splitNumberIntoPowerOfTwo(N - number);
        }
    }

    public static void main(String[] args) {

        splitNumberIntoPowerOfTwo(1008034671);
    }
}
