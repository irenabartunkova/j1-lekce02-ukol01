package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();
        nakresliPrasatko(zofka);
         zofka.penUp();
         zofka.turnRight(135.0);
         zofka.move(200.0);
         zofka.turnRight(90.0);
         zofka.move(400.0);

         zofka.penDown();

        nakresliOsmiuhelnik(zofka);

        zofka.penUp();
        zofka.turnRight(180.0);
        zofka.move(130.0);

        zofka.penDown();
        nakresliKolecko(zofka);

        zofka.penUp();
        zofka.move(180.0);
        zofka.penDown();

        nakresliSlunicko(zofka);

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
     private void nakresliOsmiuhelnik(Turtle zofka) {
         for (int i = 0; i < 8; i++) {
             zofka.move(50.0);
             zofka.turnRight(45.0);
         }

     }
    private void nakresliKolecko(Turtle zofka) {

        for (int i = 0; i < 24; i++) {
            zofka.move(15.0);
            zofka.turnLeft(15.0);
        }
     }

    private void nakresliSlunicko(Turtle zofka) {

        for (int i = 0; i < 12; i++) {
            zofka.move(30.0);
            zofka.turnRight(80.0);
            zofka.move(25.0);
            zofka.penUp();
            zofka.turnLeft(180.0);
            zofka.move(25.0);
            zofka.turnRight(100.0);
            zofka.penDown();
                      zofka.turnLeft(30.0);
        }
    }
}




