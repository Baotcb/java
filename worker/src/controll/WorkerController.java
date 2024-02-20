package controll;
import Model.Worker;
import view.WorkerView;
import java.util.ArrayList;
import java.util.List;

public class WorkerController {
    private WorkerView view;
    private ArrayList<Worker> workers;

    public WorkerController(WorkerView view) {
        this.view = view;
        this.workers = new ArrayList<>();
    }

    public void run() {
        while (true) {
            view.displayMenu();
            int choice = Integer.parseInt(view.getInput("Enter your choice"));

            switch (choice) {
                case 1:
                    addWorker();
                    break;
                case 2:
                    increaseSalary();
                    break;
                case 3:
                    decreaseSalary();
                    break;
                case 4:
                    showAdjustedSalaryWorkerInfo();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    view.displayMessage("Invalid choice. Please try again.");
            }
        }
    }

    private void addWorker() {
        view.displayMessage("---------ADD WORKER---------");
       String id=view.getInput("Enter ID");
       String name=view.getInput("Enter name ");
       int age=view.getIntInput("Enter age");
       double salary=view.getDoubleInput("Enter salary");
       String workLocation=view.getInput("Enter workLocation ");
        workers.add(new Worker(id,name,age,salary,workLocation));
    }

    private void increaseSalary() {
        view.displayMessage("---------UP SALARY---------");
        String find=view.getInput("Enter code");
        for (Worker w:workers){
            if (w.getId().equals(find)){
                w.setSalary(view.getDoubleInput("Enter Salary"));
                w.setStatus("UP");
                w.setDate(view.getInput("Enter date"));
            }
        }


    }

    private void decreaseSalary() {
        view.displayMessage("---------Down SALARY---------");
        String find=view.getInput("Enter code");
        for (Worker w:workers){
            if (w.getId().equals(find)){
                w.setSalary(view.getDoubleInput("Enter Salary"));
                w.setStatus("DOWN");
                w.setDate(view.getInput("Enter date"));
            }
        }

    }

    private void showAdjustedSalaryWorkerInfo() {
        view.displayMessage("---------Display Information---------");
        String code="Code";
        String name="Name";
        String age="Age";
        String Salary="Salary";
        String sta="Status";
        String da="Date";
        System.out.printf(" %-5s %-10s %-8s %-9s %-8s %-10s",code,name,age,Salary,sta,da);
        System.out.println();
        for (Worker w:workers){
            System.out.println(w);
        }


    }
}
