public class A1_Move extends World {
    public int randomangle;

    public void go() {
        plane.hasTrail = true;
        plane.trailWidth=4;
        plane.pausetime = 1;
        for (int x = 0; x < 20; x = x + 1) {
            System.out.println("x: " + x);
            plane.circle(100);
            plane.turnLeft(18);
            plane.move(10);

            plane.circle(6*x);
            plane.move(x);
            plane.circle(10*x);
            plane.move(2*x);
            plane.circle(16 * x);
            plane.move(3*x);

    }

}}
