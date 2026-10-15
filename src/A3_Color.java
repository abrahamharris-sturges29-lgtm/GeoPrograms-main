public class A3_Color extends World {
public int randomRed;
public int randomBlue;
public int randomGreen;
public int randomDraw;




    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(45);
        plane.hasTrail = true;
        plane.trailWidth = 6;



        randomDraw=plane.random(0,2);
        if (randomDraw == 0){
            plane.hasTrail=true;
        }


        randomRed = plane.random(0,255);
        randomBlue = plane.random(0,255);
        randomGreen = plane.random(0,255);
        plane.setTrailColor(randomRed, randomGreen, randomGreen);


        plane.pausetime = 0;
        plane.setAngle(0);

        plane.teleport(100,800);
        house();
        plane.teleport(250,800);
        house();
        plane.teleport(400,800);
        house();
        plane.teleport(550,800);
        house();
        plane.teleport(700,800);
        house();
        plane.teleport(850,800);
        house();


        plane.teleport(100,200);
        house();
        plane.teleport(250,200);
        house();
        plane.teleport(400,200);
        house();
        plane.teleport(550,200);
        house();
        plane.teleport(700,200);
        house();
        plane.teleport(850,200);
        house();

        plane.teleport(100,400);
        house();
        plane.teleport(250,400);
        house();
        plane.teleport(400,400);
        house();
        plane.teleport(550,400);
        house();
        plane.teleport(700,400);
        house();
        plane.teleport(850,400);
        house();

        plane.teleport(100,600);
        house();
        plane.teleport(250,600);
        house();
        plane.teleport(400,600);
        house();
        plane.teleport(550,600);
        house();
        plane.teleport(700,600);
        house();
        plane.teleport(850,600);
        house();


    }
    public void square(){
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);

    }
    public void house(){
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(45);
        plane.move(70);
        plane.turnLeft(90);
        plane.move(70);
        plane.turnLeft(45);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(50);
        plane.hasTrail=false;
        plane.turnLeft(90);
        plane.move(30);
        plane.hasTrail=true;
        plane.turnLeft(90);
        plane.move(20);
        plane.turnLeft(90);
        plane.move(30);
        plane.turnLeft(90);
        plane.move(20);
        plane.turnLeft(90);
        plane.move(30);
        plane.hasTrail=false;
        plane.move(30);
        plane.turnLeft(90);
        plane.move(10);
        plane.turnLeft(270);
        plane.hasTrail=true;
        plane.move(20);
        plane.turnLeft(90);
        plane.move(20);
        plane.turnLeft(90);
        plane.move(20);
        plane.turnLeft(90);
        plane.move(20);
        plane.turnLeft(90);

        plane.move(10);
        plane.turnLeft(90);
        plane.move(20);
        plane.turnLeft(90);
        plane.move(10);
        plane.turnLeft(90);
        plane.move(10);
        plane.turnLeft(90);
        plane.move(20);
        plane.hasTrail=false;
        plane.setAngle(90);
        plane.move(65);
        plane.hasTrail=true;
        plane.move(1);
        plane.teleport(550,550);
        plane.setAngle(0);
    }


}
