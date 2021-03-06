package algorithmization.multidimensionalArrays;

//Отсортировать строки матрицы по возростанию и убыванию значений элементов.


public class MultidimensionalArrays_12 {
    public static void main(String[] args) {
        int[][] arr = {{1, 221, 32}, {5, 23, 43, 1, 45, 1234}, {78, 12, 10, 33}};

        System.out.println("Our array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Сортируем по возрастанию.

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                int s = j - 1;
                for (; s >= 0; s--) {
                    if (value < arr[i][s]) {
                        arr[i][s + 1] = arr[i][s];
                    } else {
                        break;
                    }
                }
                arr[i][s + 1] = value;
            }
        }


        System.out.println("Our array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Сортируем по убыванию.

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                int s = j - 1;
                for (; s >= 0; s--) {
                    if (value > arr[i][s]) {
                        arr[i][s + 1] = arr[i][s];
                    } else {
                        break;
                    }
                }
                arr[i][s + 1] = value;
            }
        }

        System.out.println("Our array sorted in descending order: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
