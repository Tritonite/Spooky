import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class GhostTest
{
    class Point 
    {
        private Integer x;
        private Integer y;

        public Point(Integer inX, Integer inY)
        {
            x = inX;
            y = inY;
        }

        public Integer getX()
        {
            return x;
        }

        public Integer getY()
        {
            return y;
        }

        public boolean equals(Point p)
        {
            // Type of error, when you use == extra cautious more on ints
            // x == p.getY()) wont work
            return (x.equals(p.getX()) && (p.getY().equals(y)));
        }
    }



    public GhostTest()
    {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
        ArrayList<String> keys = new ArrayList<>();
        keys.add("ghost");
        keys.add("alien");
        keys.add("alien");
        keys.add("alien");
        keys.add("spiderman");
        keys.add("adiabatman");
        keys.add("scaryInvrsion");

        Integer[] values = { new Integer(1), new Integer(2), new Integer(100) };

        // ArrayList<Integer> scaryKeys = (ArrayList<Integer>) Arrays.asList(values);
        // Wont work bc need a cast exception?
        // How casting works?

        List<Integer> test = Arrays.asList(values);
        ArrayList<Integer> scaryKeys = new ArrayList<Integer>(test);

        // The arrow executes a function?

        // want to remove alien how?
        keys.removeIf(k -> k.equalsIgnoreCase("alien"));

        keys.forEach(k -> System.out.println(k));

        // cant do Point p1 = new Point(1,1);
        // b/c
        // internal class needs "special treatment"
        // Create a New GhostTest
        GhostTest gt = new GhostTest();
        GhostTest.Point p1 = gt.new Point(1, 1);
        GhostTest.Point p2 = gt.new Point(new Integer(1), new Integer(1));

        if (p1.equals(p2))
            System.out.println("wow");
        else
        {
            System.out.println("aha");
        }

        TreeSet<GhostTest.Point> tp = new TreeSet<>();

        ArrayList<GhostTest.Point> points = new ArrayList<>();

        for (int index = 0; index < 5; ++index)
        {
            points.add(p1);
            //tp.add(p1)
            tp.forEach(t -> tp.add(p1));

        }

        points.forEach(p -> System.out.println(p.getX()));

       //tp.addAll(points);
        tp.forEach(t -> tp.addAll(points));

        tp.forEach(p -> System.out.println(p.getX()));

        // if you use collection, the set by definition doesnt keep copy so you have to
        // compare 2 elements with each other
        // Tree set keeps them in order, Hashset doesnt keep in order
    }

}
