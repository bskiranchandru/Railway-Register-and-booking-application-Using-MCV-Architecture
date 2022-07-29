
public class App {
    public static void main(String[] args) {
    Model m = new Model(" ", " "," "," "," "," ");
    View v = new View("Railway booking");
    Controller c = new Controller(m, v);
    c.initController();
 }
}
