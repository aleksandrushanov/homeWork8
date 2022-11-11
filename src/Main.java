public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");
        // Задание 3
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = number.length - 1; i >=0; i--) {
            if (i!=0){
                System.out.print(number[i]+" ,");
            }else {
                System.out.print(number[i]);
            }
        }
        System.out.println("\n");

        double[] fractional ={1.57, 7.654, 9.986};
        for (int a = fractional.length - 1 ;a >=0; a--) {
            if (a !=0){
                System.out.print(fractional[a] + ", ");
            }else {
                System.out.print(fractional[a]);
            }
        }

        System.out.println("\n");
        int [] age = new int[4];
        age[0]=15;
        age[1]=16;
        age[2]=17;
        age[3]=18;
        for (int i =age.length - 1; i >=0; i--) {
            if (i !=0){
                System.out.print(age[i] +", ");
            }else {
                System.out.print(age[i]);
            }
            
        }


    }
}
