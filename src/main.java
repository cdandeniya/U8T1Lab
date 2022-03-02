import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String[][] seating = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};

        for (String[] person: seating) {
            System.out.println(Arrays.toString(person));
        }

        System.out.println();

        seating[1][2] = "Paul";
        for (String[] person: seating) {
            System.out.println(Arrays.toString(person));
        }

        System.out.println();

        String temp = seating[0][0];
        seating[0][0] = seating[2][3];
        seating[2][3] = temp;
        for (String[] person: seating) {
            System.out.println(Arrays.toString(person));
        }

        System.out.println();

        String[] temp_list = seating[0];
        seating[0] = seating[1];
        seating[1] = temp_list;
        for (String[] person: seating) {
            System.out.println(Arrays.toString(person));
        }

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        for (int[] in : arr1) {
            System.out.println(Arrays.toString(in));
        }
        for (int[] in : arr2) {
            System.out.println(Arrays.toString(in));
        }

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;

        for (int[] in : arr1) {
            System.out.println(Arrays.toString(in));
        }
        for (int[] in : arr2) {
            System.out.println(Arrays.toString(in));
        }

        // part 2
        int[][] array1 = {{5,2}, {1,3}, {7,9}};
        System.out.println(FunWith2DArrays.totalElements(array1));

        int[][] array2 = {{1,2,3}, {6,5,4}};
        System.out.println(FunWith2DArrays.totalElements(array2));

        int[][] array8 = {{4}};
        System.out.println(FunWith2DArrays.totalElements(array8));

        int[][] array9 = {{}};
        System.out.println(FunWith2DArrays.totalElements(array9));

        // part 3
        String[][] testArray1 = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        FunWith2DArrays.fourCorners(testArray1);

        String[][] testArray2 = {{"time"}};
        FunWith2DArrays.fourCorners(testArray2);

        String[][] testArray3 = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(testArray3);
    }
}
