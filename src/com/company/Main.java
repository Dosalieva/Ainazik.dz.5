package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss= new Boss();
        boss.setHealth(800);
        System.out.println("Здоровье босса: "+ boss.getHealth());

        boss.setDamage(20);
        System.out.println("Урон босса: "+ boss.getDamage());

        boss.setDifferenceType("Телепортация: ");
        System.out.println("Тип защиты босса: "+ boss.getDifferenceType());
    }
}
