package com.company;

public class Map {
    private final static int MAP_SIZE = 10;
    private final static  int DEFAULT_LEVEL = 3;
    //int[][][] map = new int[MAP_SIZE][MAP_SIZE][DEFAULT_LEVEL];
    char[][][] map = new char[MAP_SIZE][MAP_SIZE][DEFAULT_LEVEL];
    public void Map(){
        int level = 0;
        while (level < 3) {
            for (int i = 0; i < MAP_SIZE; i++) {
                for (int j = 0; j < MAP_SIZE; j++) {
                    map[i][j][level] = 0;
                }
            }
            level++;
        }
    }

    public void showMap(int level){
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (map[i][j][level] != 0 && map[i][j][level] != 1){
                    System.out.print((char) map[i][j][level] + " ");
                }else{
                    System.out.print((short) (map[i][j][level]) + " ");
                }
            }
            System.out.println();
        }
    }
    public char getMap(int x,int y,int level){
        return map[x][y][level];
    }


    public void setMap(int x, int y, int level, char o){
        map[x][y][level] = o;
    }
    public void setShip() {
        int SP_CONST = 60;
        int shipPoint = 0;
        while (shipPoint < SP_CONST) {
            int b1 = (int) (Math.random() * 4) + 1;
            int b2 = (int) (Math.random() * 2) + 1;
            //System.out.println(" b1=" + b1 + "b2=" + b2);
            if (b1 == 1) {
                int x = (int) (Math.random() * 10);
            //    System.out.println("x="+x);
                int y = (int) (Math.random() * 10);
            //    System.out.println("y="+y);
                int level = (int) (Math.random() * 3);
                map[x][y][level] = 1;
                shipPoint++;
            }
            if (b1 != 1) {
                if (b2 == 0) {
                    int x = (int) (Math.random() * 10);
                    if (x > 5)
                        x -= b1;
            //        System.out.println("x="+x);
                    int y = (int) (Math.random() * 10);
            //        System.out.println("y="+y);
                    int level = (int) (Math.random() * 3);
                    for (int i = 0; i < b1; i++) {
                        map[x + i][y][level] = 1;
                        shipPoint++;
                    }
                }
                if (b2 == 1) {
                    int x = (int) (Math.random() * 10);
            //        System.out.println("x="+x);
                    int y = (int) (Math.random() * 10);
                    if (y > 5)
                        y -= b1;
            //        System.out.println("y="+y);
                    int level = (int) (Math.random() * 3);
                    for (int i = 0; i < b1; i++) {
                        map[x][y + i][level] = 1;
                        shipPoint++;
                    }
                }
            }
        }
    }
}
