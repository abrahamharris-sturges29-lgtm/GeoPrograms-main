public class A5_Square extends World {
    public int randomred1;
    public int randomblue1;
    public int randomgreen1;

    public int randomred2;
    public int randomblue2;
    public int randomgreen2;

    public int randomred3;
    public int randomblue3;
    public int randomgreen3;

    public int randomangle1;
    public int randomangle2;
    public int randomangle3;

    public void go() {
        plane.trailWidth = 4;
        plane.pausetime = 0;
        plane.setTrailColor(100, 10, 200);

        plane.setAngle(90);

        for(int x=0;x<90;x=x+1) {
            System.out.println("x: " + x);
            square(111);
            plane.turnLeft(7);
            bigsquare(200);
            plane.turnLeft(7);
            greatsquare(300);
            plane.turnLeft(7);
        }

    }


    public void square(int sidelength) {
        randomred1 = plane.random(0,255);
        randomblue1 = plane.random(0,255);
        randomgreen1 = plane.random(0,255);
            plane.setTrailColor(randomred1, randomgreen1, randomblue1);

            randomangle1 = plane.random(0,180);
        randomangle1 = plane.random(0,180);
        randomangle1 = plane.random(0,180);

        plane.hasTrail = true;
        plane.trailWidth=2;
        plane.move(sidelength);
        plane.turnLeft(90);
        plane.move(sidelength);
        plane.turnLeft(90);
        plane.move(sidelength);
        plane.turnLeft(90);
        plane.move(sidelength);
        // notice the direction your plane is facing at this point
    }
public void bigsquare(int sidelength2) {
    randomred2 = plane.random(0,255);
    randomblue2 = plane.random(0,255);
    randomgreen2 = plane.random(0,255);
    plane.setTrailColor(randomred2, randomgreen2, randomblue2);
    plane.hasTrail = true;
    plane.trailWidth=4;
    plane.move(sidelength2);
    plane.turnLeft(90);
    plane.move(sidelength2);
    plane.turnLeft(90);
    plane.move(sidelength2);
    plane.turnLeft(90);
    plane.move(sidelength2);
}
    public void greatsquare(int sidelength3) {
        randomred3 = plane.random(0,255);
        randomblue3 = plane.random(0,255);
        randomgreen3 = plane.random(0,255);
        plane.setTrailColor(randomred3, randomgreen3, randomblue3);
        plane.hasTrail = true;
        plane.trailWidth=8;
        plane.move(sidelength3);
        plane.turnLeft(90);
        plane.move(sidelength3);
        plane.turnLeft(90);
        plane.move(sidelength3);
        plane.turnLeft(90);
        plane.move(sidelength3);
    }




}


