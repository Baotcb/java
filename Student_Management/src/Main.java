
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controll controll= new Controll(model,view);
        controll.run();

    }
}