package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;

public class CanPlaceFlowerS {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int daParaPlantar = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {

                boolean esquerdaVazia = (i == 0 || flowerbed[i - 1] == 0);
                boolean direitaVazia = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                if (esquerdaVazia && direitaVazia) {
                    flowerbed[i] = 1;
                    daParaPlantar++;
                }
            }

            if (daParaPlantar >= n) {
                return true;
            }
        }

        return daParaPlantar >= n;

    }

}