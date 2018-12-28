package com.company;

public class Player implements GameUser, Shooting{
    private int shipPoint = 60;
    Map map;
    Player (Map map){
        this.map = map;
    }
    public void setShipPoint(){
        shipPoint -= 1;
    }
    public int getShipPoint(){
        return shipPoint;
    }
    public boolean shooting(Bot enemy,Map publicMap, int x, int y, int level ){
        if (enemy.map.getMap(x,y,level) == 1){
            enemy.map.setMap(x,y,level,'X');
            publicMap.setMap(x,y,level,'X');
            enemy.setShipPoint();
            return true;
        }
        if (enemy.map.getMap(x,y,level) == 0){
            enemy.map.setMap(x,y,level,'-');
            publicMap.setMap(x,y,level,'-');
            return true;
        }
        return false;
    }
}
