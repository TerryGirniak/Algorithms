public class Fibonacci {

    private long fibonacci(int position){

        if(position <= 0){
            return -1;

        } else if(position == 1 || position == 2){
            return 1;

        } else{
            return fibonacci(position - 2) + fibonacci(position - 1);
        }
    }

    public static void main(String[] args){

        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci(20));
    }
}
