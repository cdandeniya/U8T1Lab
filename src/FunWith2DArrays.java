public class FunWith2DArrays {
    public static int totalElements(int[][] list) {
        return list.length * list[0].length;
    }

    public static void fourCorners(String[][] list) {
        int rows = list.length;
        int columns = list[0].length;

        System.out.println(list[0][0]);
        System.out.println(list[0][columns-1]);
        System.out.println(list[rows-1][0]);
        System.out.println(list[rows-1][columns-1]);
    }
}
