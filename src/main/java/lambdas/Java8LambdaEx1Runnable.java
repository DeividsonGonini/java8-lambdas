package lambdas;

public class Java8LambdaEx1Runnable {
    public static void main(String[] args) {
        //Java 8: Funções Lambda

        //EXEMPLO 1
        //Implementação Antiga
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Olá mundo");
            }
        }).run();

        //Implementação Nova - Com Lambda
        new Thread(() -> System.out.println("Olá mundo - com lambda")).run();

    }
}
