public class Calculator {
    int result;
    public int add(int a, int b){
        result = a + b;
        return result;
    }
    public int subtract(int a, int b){
        result = a - b;
        return result;
    }

    public int Multiplication(int a, int b){
        result = a * b;
        return result;
    }

    public int Division(int a, int b) throws RuntimeException {

            if(b==0) {
                throw new RuntimeException("division by zero not possible ");
            }


        result = a / b;

        return result;
    }

}
