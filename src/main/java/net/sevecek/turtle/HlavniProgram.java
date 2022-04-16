package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

        zofka.penUp();
        zofka.turnLeft(90.0);
        zofka.move(350.0);
        zofka.turnRight(90);
        zofka.move(200.0);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliSlunicko(zofka);

        zofka.penUp();
        zofka.turnRight(180.0);
        zofka.move(120.0);
        zofka.turnLeft(90);
        zofka.move(300.0);
        zofka.turnRight(180.0);
        zofka.penDown();

        for (int i = 0; i < 5; i++) {
            nakresliDomecek(zofka);
        }
        zofka.penUp();
        zofka.turnRight(180.0);
        zofka.move(300.0);
        zofka.turnRight(90.0);
        zofka.move(250.0);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.turnLeft(90.0);
        zofka.move(1250.0);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.turnRight(90.0);
        zofka.move(280.0);
        zofka.turnLeft(90.0);
        zofka.move(50.0);
        zofka.penDown();

        nakresliPrasatko(zofka);

        zofka.penUp();
        zofka.turnRight(135.0);
        zofka.move(130.0);
        zofka.turnRight(90.0);
        zofka.move(200.0);
        zofka.turnRight(90.0);
        zofka.penDown();

        nakresliPismenoI(zofka);

        zofka.penUp();
        zofka.turnRight(90.0);
        zofka.move(50.0);
        zofka.turnRight(90.0);
        zofka.move(60.0);
        zofka.turnLeft(180.0);
        zofka.penDown();

        nakresliPismenoR(zofka);

        zofka.penUp();
        zofka.turnLeft(60.0);
        zofka.move(50.0);
        zofka.turnLeft(90.0);
        zofka.penDown();

        nakresliPismenoE(zofka);

        zofka.penUp();
        zofka.move(50.0);
        zofka.turnLeft(90.0);
        zofka.penDown();

        nakresliPismenoN(zofka);

        zofka.penUp();
        zofka.turnRight(90.0);
        zofka.move(50.0);
        zofka.turnRight(90.0);
        zofka.move(60.0);
        zofka.turnLeft(180.0);
        zofka.penDown();

        nakresliPismenoA(zofka);

        zofka.penUp();
        zofka.turnRight(180.0);
        zofka.move(200.0);










       /*nakresliPrasatko(zofka);
         zofka.penUp();
         zofka.turnRight(135.0);
         zofka.move(200.0);
         zofka.turnRight(90.0);
         zofka.move(400.0);

         zofka.penDown();*/

       /* nakresliOsmiuhelnik(zofka);

        zofka.penUp();
        zofka.turnRight(180.0);
        zofka.move(130.0);

        zofka.penDown();
        nakresliKolecko(zofka);

        zofka.penUp();
        zofka.move(180.0);
        zofka.penDown();

        nakresliSlunicko(zofka);
        /*nakresliDomecek(zofka);*/


    }

    private void nakresliPrasatko(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.move(120.0);
            zofka.turnRight(90.0);
        }

        zofka.turnLeft(60.0);
        zofka.penDown();
        zofka.move(120.0);
        zofka.turnRight(120.0);
        zofka.move(120.0);

        zofka.turnRight(30.0);
        zofka.penUp();
        zofka.move(120.0);
        zofka.turnRight(90.0);
        zofka.move(120.0);
        zofka.turnRight(90.0);
        zofka.penDown();

        zofka.turnLeft(135.0);
        zofka.move(40.0);
        zofka.penUp();
        zofka.turnRight(180.0);
        zofka.move(40.0);
        zofka.turnLeft(90.0);
        zofka.penDown();
        zofka.move(40.0);
        zofka.penUp();
        zofka.turnRight(180.0);
        zofka.move(40.0);

        zofka.penUp();
        zofka.turnLeft(135.0);
        zofka.move(120.0);
        zofka.penDown();
        zofka.turnLeft(135.0);
        zofka.move(40.0);
        zofka.penUp();
        zofka.turnRight(180.0);
        zofka.move(40.0);
        zofka.turnLeft(90.0);
        zofka.penDown();
        zofka.move(40.0);
        zofka.penUp();
        zofka.turnRight(180.0);
        zofka.move(40.0);

    }
    /* private void nakresliOsmiuhelnik(Turtle zofka) {
         for (int i = 0; i < 8; i++) {
             zofka.move(50.0);
             zofka.turnRight(45.0);
         }

     }*/
   /* private void nakresliKolecko(Turtle zofka) {

        for (int i = 0; i < 24; i++) {
            zofka.move(15.0);
            zofka.turnLeft(15.0);
        }
     }*/

    private void nakresliSlunicko(Turtle zofka) {

        for (int i = 0; i < 9; i++) {
            zofka.move(10.0);
            zofka.turnLeft(20.0);
            zofka.move(10.0);
            zofka.turnRight(80.0);
            zofka.move(25.0);
            zofka.penUp();
            zofka.turnLeft(180.0);
            zofka.move(25.0);
            zofka.turnRight(100.0);
            zofka.penDown();
            zofka.turnLeft(20.0);
        }
    }

    private void nakresliDomecek(Turtle zofka) {


        for (int i = 0; i < 4; i++) {
            zofka.move(150.0);
            zofka.turnRight(90.0);
        }


        zofka.penUp();
        zofka.move(150.0);
        zofka.penDown();

        zofka.turnRight(30.0);
        zofka.move(150.0);
        zofka.turnRight(120.0);
        zofka.move(150.0);

        zofka.turnRight(30.0);
        zofka.penUp();
        zofka.move(150.0);
        zofka.turnRight(90.0);
        zofka.penUp();
        zofka.turnLeft(180.0);
        zofka.move(100);
        zofka.turnLeft(90.0);
        zofka.penDown();

    }
    private void nakresliPismenoI(Turtle zofka) {
        zofka.move(60.0);

}
    private void nakresliPismenoR(Turtle zofka) {
        zofka.move(60.0);
        zofka.turnRight(90.0);
        for (int i = 0; i < 9; i++) {
            zofka.move(5.0);
            zofka.turnRight(20.0);
                    }
        zofka.turnLeft(120.0);
        zofka.move(35.0);

    }
    private void nakresliPismenoE(Turtle zofka) {
        zofka.move(60.0);
        zofka.turnRight(90.0);
        zofka.move(25.0);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(25);
        zofka.turnLeft(90.0);
        zofka.move(30.0);
        zofka.turnLeft(90.0);
        zofka.penDown();
        zofka.move(25.0);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(25);
        zofka.turnLeft(90.0);
        zofka.move(30.0);
        zofka.turnLeft(90.0);
        zofka.penDown();
        zofka.move(25.0);
}
    private void nakresliPismenoN(Turtle zofka) {
        zofka.move(60.0);
        zofka.turnRight(150.0);
        zofka.move(70.0);
        zofka.turnLeft(150.0);
        zofka.move(60.0);
            }
    private void nakresliPismenoA(Turtle zofka) {
        zofka.turnRight(25.0);
        zofka.move(65.0);
        zofka.turnRight(135.0);
        zofka.move(65.0);
        zofka.turnRight(180.0);
        zofka.move(30.0);
        zofka.turnLeft(70);
        zofka.move(25.0);


    }
}














