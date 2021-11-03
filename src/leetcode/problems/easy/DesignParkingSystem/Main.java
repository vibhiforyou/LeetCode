package leetcode.problems.easy.DesignParkingSystem;

class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            } else {
                return false;
            }
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            } else {
                return false;
            }
        } else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String args[]) {
        int[][] parkingSystemInput = new int[][]{new int[]{1, 1, 0}, new int[]{1}, new int[]{2}, new int[]{3}, new int[]{1}};
        ParkingSystem parkingSystem = new ParkingSystem(parkingSystemInput[0][0], parkingSystemInput[0][1], parkingSystemInput[0][2]);
        for (int i = 1; i < parkingSystemInput.length; i++) {
            System.out.println(parkingSystem.addCar(parkingSystemInput[i][0]));
        }
    }
}
