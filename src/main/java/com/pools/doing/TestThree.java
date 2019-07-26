package com.pools.doing;

public class TestThree {

    public static void main(String[] args) {
        int[][] arr = {{23, 45, 123}, {545}, {124,543}};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("-------" + i + "-------");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
