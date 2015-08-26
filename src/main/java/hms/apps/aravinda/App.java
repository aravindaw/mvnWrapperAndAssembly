package hms.apps.aravinda;

/**
 * Created by aravinda on 8/24/15.
 */
public class App {

    int x,z,y;
    public static void main(String[] args) {
        System.out.println(new App());
    }

    public App() {
        x = 1;
        y = 2;
        z = 3;
    }

    @Override
    public String toString() {
        return "values is="+x+","+y+","+z;
    }
}
