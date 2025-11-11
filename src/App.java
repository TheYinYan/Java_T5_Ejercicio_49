public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        int max = 0;
        int min = 0;
        int numNoPrimo = 0;
        double media = 0;
        int num = 0;
        boolean primo = false;
        while (!primo) {
            num = Integer.parseInt(System.console().readLine());
            if (min == 0) {
                min = num;
            }
            if (num <= 2) {
                primo = false;
            } else {
                primo = true;
                for (int i = 2; i < num / 2; i++) {
                    if (num % i == 0) {
                        primo = false;
                    }
                }
            }
            // Num Max y Num Min
            if (!primo) {
                if (num > max)
                    max = num;
                if (num < min)
                    min = num;
            }

            if (!primo) {
                numNoPrimo++;
                media +=num; 
            }
        }
        media/=numNoPrimo;
        System.out.printf("Ha introducido %d números no primos %n",numNoPrimo);
        System.out.printf("Máximo: %d%n",max);
        System.out.printf("Mínimo: %d%n",min);
        System.out.printf("Media: %.2f%n",media);
    }
}
