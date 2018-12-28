package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = false;
        int level;
        Scanner sc = new Scanner(System.in);
        Map publicMap = new Map();
        Map playerMap = new Map();
        Map botMap = new Map();
        Bot b = new Bot(botMap);
        Player p = new Player(playerMap);
        p.map.setShip();//BETA
        b.map.setShip();//BETA
        System.out.println("Корабли расставлены");
        while (!gameOver){
            boolean shotdone = false;
            System.out.println("Введите глубину атаки от 0 до 2:");
            level = sc.nextInt();
            publicMap.showMap(level);
            System.out.println();
            System.out.println("Ваша карта:");
            p.map.showMap(level);
            while (!shotdone){
                boolean playerShotDone = false;
                System.out.println("Для атаки введите 1, для смены глубины введите 2:");
                if (sc.nextInt() == 1){
                    while (!playerShotDone){
                        System.out.println("Введите x:");
                        int x = sc.nextInt();
                        System.out.println("Введите y:");
                        int y = sc.nextInt();
                        if(p.shooting(b,publicMap,x,y,level)){
                            //System.out.println("a");
                            playerShotDone = true;
                        }else{
                            //System.out.println("b");
                        }
                    }
                    shotdone = true;
                }else{
                    System.out.println("Введите глубину атаки от 0 до 2:");
                    level = sc.nextInt();
                    publicMap.showMap(level);
                    System.out.println();
                    System.out.println("Ваша карта:");
                    p.map.showMap(level);
                }
            }
            b.botShooting(p);
            if (p.getShipPoint() == 0 || b.getShipPoint() == 0){
                gameOver = true;
            }
        }
    }
}
