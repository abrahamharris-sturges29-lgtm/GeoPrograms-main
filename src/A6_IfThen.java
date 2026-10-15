public class A6_IfThen extends World {
    public int randomred3;
    public int randomblue3;
    public int randomgreen3;
    public int randNum;

    public void go() {
        plane.hasTrail = true;
        plane.pausetime = 0;
        plane.trailWidth = 55;
        plane.teleport(0, 0);
        plane.setAngle(321);
        for (int z = 0; z < 20; z = z + 1) {
            for (int y = 0; y < 10; y = y + 1) {
                System.out.println("y: " + y);
                plane.setTrailColor(0,255-(12*z),255-(12*y));
                square(50);
                plane.hasTrail = false;
                plane.setAngle(90);
                plane.move(100);
                plane.hasTrail = true;

            }
            plane.teleport(100*(z+1), 0);
        }

    }

    public void square(int c) {

        plane.setAngle(90);
        for (int x = 0; x < 4; x = x + 1) {
        plane.move(c);
        plane.turnLeft(90);
    }
    }

    public void rectangle(int a, int b) {
        plane.setAngle(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    }
    public void bigsquare(int sidelength3) {
        randomred3 = plane.random(147,153);
        randomblue3 = plane.random(125,175);
        randomgreen3 = plane.random(147,153);
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
    public void circle(int circum) {
        plane.circle(circum);
    }}




