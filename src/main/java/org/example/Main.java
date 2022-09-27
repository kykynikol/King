package org.example;

import knight.BagException;
import knight.Knight;
import knight.MyException;
import weapon.Sword;

public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword("Ласточкка", 100, 2);
        Knight knight = new Knight("i", 50, 100);
        try {
            while (true){
                knight.buy(sword);
            }
        }catch (MyException myException){
            System.out.println("Деньги кончились " + myException.toString());
        }catch (BagException bagException){
            System.out.println("Место кончилось " + bagException.toString());
        }finally {
            System.out.println("Экипировка завершена ");
        }

    }
}
