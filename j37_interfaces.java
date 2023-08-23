interface bicycle {
    void applybrake(int decrement);

    void speedup(int increment);
}

class hero implements bicycle {
    public void applybrake(int decrement) {
        System.out.println("applying brake");
    }

    public void speedup(int increment) {
        System.out.println("speeding up");
    }
}

public class j37_interfaces {
    public static void main(String[] args) {
        hero h = new hero();
        h.applybrake(1);
        h.speedup(1);
    }
}
