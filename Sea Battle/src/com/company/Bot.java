package com.company;

public class Bot implements GameUser, BotShooting{
    private int shipPoint = 60;
    Map map;

    Bot (Map map){
        this.map = map;
    }
    public void setShipPoint(){
        shipPoint -= 1;
    }
    public int getShipPoint() {
        return shipPoint;
    }
    public void botShooting(Player enemy){
        boolean flag = false;
        while (!flag){
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            int level = (int) (Math.random() * 3);
            if (enemy.map.getMap(x,y,level) == 1){
                enemy.map.setMap(x,y,level,'X');
                System.out.println("Вас атаковали по координатам: " + x + " " + y + " " + level);
                setShipPoint();
                flag = true;
            }
            if (enemy.map.getMap(x,y,level) == 0){
                enemy.map.setMap(x,y,level,'-');
                System.out.println("Вас атаковали по координатам(x,y,z): " + x + " " + y + " " + level);
                flag = true;
            }
        }
    }
}
