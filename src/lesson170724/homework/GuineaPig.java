package lesson170724.homework;

/**
 * Created by kseni on 25.07.2017.
 */
public class GuineaPig implements Pet {

    Brain brain = new Jittery(this);

    @Override
    public void play() {
        brain.play();
    }

    @Override
    public void stroke() {
        brain.stroke();
    }

    public void runAway() {
        System.out.println("runs away");
    }
    public void escape() {
        System.out.println("escapes");
    }

    public void runAround() {
        System.out.println("runs around");
    }

    public void rumble() {
        System.out.println("rumbles");

    }

    public void jump() {
        System.out.println("jumps");
    }

}

class Jittery implements Brain {
    GuineaPig guineaPig;

    Jittery(GuineaPig gp) {
        guineaPig = gp;
    }

    @Override
    public void play() {
        guineaPig.escape();
        guineaPig.runAway();
    }

    @Override
    public void stroke() {
        guineaPig.rumble();
        guineaPig.brain = new Chummy(guineaPig);
    }
}

class Chummy implements Brain {
    GuineaPig guineaPig;

    Chummy(GuineaPig gp) {
        guineaPig = gp;
    }

    @Override
    public void play() {
        guineaPig.jump();
        guineaPig.runAround();

        guineaPig.brain = new Jittery(guineaPig);
    }

    @Override
    public void stroke() {
        guineaPig.runAway();
    }
}
