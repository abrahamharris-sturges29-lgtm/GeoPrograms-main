public class Gradedhwimage extends World{

    public int randomred3;
    public int randomblue3;
    public int randomgreen3;
    //sets up random colors for if then loop



    public void go() {
        plane.hasTrail = true;
        plane.pausetime = 0;
        plane.trailWidth = 77;
        plane.teleport(0, 0);

        //sets bases for everything

        for (int z = 0; z < 5; z = z + 1) {
            plane.teleport(400*(z),0);
            //changes how far across it goes based on how far into the loop

            for (int y = 0; y < 4; y = y + 1) {
                System.out.println("y: " + y);

                rectangle(200,115);
                plane.hasTrail = false;
                plane.setAngle(90);
              plane.move(300);
                plane.hasTrail = true;
                //makes a rectangle than moves down
           }



        for (int y = 0; y < 4; y = y + 1) {
            System.out.println("y: " + y);
            plane.teleport(200*((2*z)+1), 250 * (y+1));
            plane.setAngle(0);
            house();
            plane.teleport(200*((2*z)+1), 250 * (y+2));
            //changes how far down and across it goes based on how far into the loop


        }


        }





    }









        public void rectangle(int a, int b) {
            randomred3 = plane.random(50,150);
            randomblue3 = plane.random(50,150);
            randomgreen3 = plane.random(50,150);
            plane.setTrailColor(randomred3, randomgreen3, randomblue3);

            if (randomblue3>randomgreen3){
                plane.setTrailColor(randomred3,randomgreen3, 255);
            }
            if (randomgreen3>randomred3){
                plane.setTrailColor(randomred3,255, randomblue3);
            }
            if (randomred3>randomblue3){
                plane.setTrailColor(255,randomgreen3, randomblue3);
            }
            //sets one dominant color always



            plane.trailWidth = 4;
            plane.pausetime=0;
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



    public void house(){
        //copy-pasted house code from earlier


        randomred3 = plane.random(147,153);
        randomblue3 = plane.random(125,175);
        randomgreen3 = plane.random(147,153);
        plane.setTrailColor(randomred3, randomgreen3, randomblue3);

        if (randomblue3>randomgreen3){
            plane.setTrailColor(randomred3,randomgreen3, 255);
        }
        if (randomgreen3>randomred3){
            plane.setTrailColor(randomred3,255, randomblue3);
        }
        if (randomred3>randomblue3){
            plane.setTrailColor(255,randomgreen3, randomblue3);
        }
            //sets one dominant color always

        plane.trailWidth =4;
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

