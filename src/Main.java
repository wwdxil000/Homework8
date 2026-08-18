public class Main {
    public static void main(String[] args) {
        // 1
        int [] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double [] arr2 = {1.57, 7.654, 9.986};
        int [] arr3 = {24, 756, 234, 134};
        // 2
        for (int i = 0; i < arr1.length; i++){
            if (arr1.length-1 == i){
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        for (int i = 0; i < arr2.length; i++){
            if (arr2.length-1 == i) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (int i = 0; i < arr3.length; i++){
            if (arr3.length-1 == i){
                System.out.println(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        // 3
        for (int i = arr1.length-1; i >= 0; i--){
            if (i == 0){
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        for (int i = arr2.length-1; i >= 0; i--){
            if (i == 0){
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (int i = arr3.length-1; i >= 0; i--){
            if (i == 0){
                System.out.println(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        // 4
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] % 2 == 1){
                arr1[i]++;
            }
        }
        for (int i = 0; i < arr1.length; i++){
            if (arr1.length-1 == i){
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
    }
}