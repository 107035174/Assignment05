package Prob3;

public class Driver {
    public static void main(String[] args) {
        Figure[] objects = {new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()
        };
        for (Figure o : objects) {
            o.getFigure();
        }
        for (Figure o : objects) {
            System.out.print("\n" + o.getClass().getSimpleName() + " : ");
            o.getFigure();
        }
    }
}
