
import java.util.ArrayList;

class Control {
  
    private Manager manager;

    public Control( Manager manager) {
    
        this.manager = manager;
    }

    public void run() {
        ArrayList<Doctor> ld = new ArrayList<>();
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    manager.addDoctor(ld);
                    break;
                case 2:
                    manager.updateDoctor(ld);
                    break;
                case 3:
                    manager.deleteDoctor(ld);
                    break;
                case 4:
                    manager.searchDoctor(ld);
                    break;
                case 5:
                    return;
            }
        }
    }
}
