import java.util.ArrayList;

public class Controll {
    private ArrayList<Student> stu;
    private ArrayList<Course>  co;
    private ArrayList<Report> list_Rp ;
    private Model model;
    private View view;
    public Controll(Model model,View view) {
        this.model=model;
        this.view=view;
        this.stu = new ArrayList<>();
        this.co = new ArrayList<>();
        this.list_Rp=new ArrayList<>();
    }

    public void run() {
        while(true){
            view.menu();

            switch (view.getInt("Enter your choice",1,5)){
                case 1:{
                    create();
                    break;
                }
                case 2:{
                    Find();
                    break;
                }
                case 3:{
                   UpdateDelete();
                   break;
                }
                case 4:{
                    report();
                    break;
                }
                case 5:{
                    System.exit(0);
                }
            }
        }
    }

    private void report() {
        if (stu == null) {
            System.err.println("List empty");
            return;
        }

            for (int i = 0; i < list_Rp.size(); i++) {
                for (Student a:stu){
                    if (list_Rp.get(i).getId() == a.getId()){
                        System.out.println("Name:" + a.getName() + "  - Course: " + list_Rp.get(i).getCourseName() + " - Total: " + list_Rp.get(i).getTotalCourse());
                        break;
                    }
                }

            }


    }

    private boolean checkReport(ArrayList<Report> listRp, int id, String courseName, int total) {
        if (listRp != null) {
            for (Report rp : listRp) {
                if (id == rp.getId() && courseName.equalsIgnoreCase(rp.getCourseName()) && total == rp.getTotalCourse()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void UpdateDelete() {
        if(stu==null){
            System.err.println("List empty");
            return;
        }
        int id=view.getInt("enter id to search",0,1000);
        ArrayList<Student> list_stu=new ArrayList<>();
        ArrayList<Course> list_co=new ArrayList<>();
        for (Student s:stu){
            if (s.getId()==id){
                list_stu.add(s);
            }
        }
        for (Course s:co){
            if (s.getId()==id){
                list_co.add(s);
            }
        }
        if(list_stu==null){
            System.err.println("Not found");
            return;
        }
        Student s=list_stu.get(0);
        Course cs=list_co.get(0);
        System.out.println("Do you want to update or delete?");
        System.out.println("1. Update");
        System.out.println("2. Delete");
        switch(view.getInt("",1,2)){
            case 1:{
                s.setId(id);
                s.setName(view.getString("Enter name: "));
                cs.setId(id);
                cs.setSemester(view.getInt("Enter Semester: ", 1, 10));
                cs.setCourseName(view.getString("Enter Course name: "));
                System.out.println("Update Succcess");
                break;
            }
            case 2:{
                stu.remove(s);
                co.remove(cs);
                System.out.println("Delete complete");
                break;
            }
        }
    }

    private void Find() {
        if (stu==null){
            System.out.println("List empty");
            return;
        }
        String name = view.getString("Enter name to search: ");
        ArrayList<Student> ListFound = new ArrayList<>();
        for (Student s:stu){
            if (s.getName().contains(name)){
                ListFound.add(s);
            }
        }
        if (ListFound==null){
            System.err.println("Not found");
            return;
        }
            displayStudent(ListFound);
    }
    public void displayStudent(ArrayList<Student> list_s) {
        for (Student s : list_s) {
            System.out.println("Id: " + s.getId() + " - Name: " + s.getName());
            for (Course cs : co) {
                if (s.getId() == cs.getId()) {
                    System.out.println("Semester: " + cs.getSemester() + " - courseName: " + cs.getCourseName());
                }
            }
        }
    }

    public void create(){
        int id= view.getInt("Enter id ",0,1000);
        Student exStu=findStudentById(id);
        if  (exStu==null){
            String name=view.getString("Enter name:");
            stu.add(new Student(id,name));
            int semester =view.getInt("Enter semester ",1,3);
            String c=view.getString("enter course name  ");
            co.add(new Course(id,semester,c));
            list_Rp.add(new Report(id,c));
        }
        else {
            int semester =view.getInt("Enter semester ",1,3);
            String cou=view.getString("enter course name");
            for (Course s:co){
                if ((s.getId()==exStu.getId())&& (cou.equalsIgnoreCase(s.getCourseName()))){
                    for (Report rp:list_Rp){
                        if (rp.getId()==s.getId()){
                            rp.setTotalCourse(rp.getTotalCourse()+1);
                            return;
                        }
                    }
                }
            }
            co.add(new Course(id,semester,cou));
            list_Rp.add(new Report(id,cou));
        }

    }

    private Student findStudentById(int id) {
        for (Student student : stu) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
