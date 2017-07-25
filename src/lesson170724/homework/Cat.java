package lesson170724.homework;

/**
 * Created by kseni on 25.07.2017.
 */
public class Cat implements Pet {
    private Brain brain = new Angry();

    private class Angry implements Brain {

        @Override
        public void stroke() {
            purr();
            purr();
            brain = new Happy();
        }

        @Override
        public void play() {
            bite();
            claw();
        }

    }


    private class Happy implements Brain {

        @Override
        public void stroke() {
            goAway();
        }

        @Override
        public void play() {
            hunt();
            catchIt();
            meow();
            brain = new Angry();
        }

    }



    @Override
    public void stroke() {
        brain.stroke();
    }

    @Override
    public void play() {
        brain.play();
    }


    private void bite() {
        System.out.println("bites");
    }

    private void claw() {
        System.out.println("claws");
    }

    private void hunt() {
        System.out.println("hunts");
    }

    private void catchIt() {
        System.out.println("catches it");
    }

    private void meow() {
        System.out.println("meow");
    }
    private void purr() {
        System.out.println("purr-purr-purr");
    }
    private void goAway() {
        System.out.println("goes away");
    }

}
