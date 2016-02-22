package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Employee {

    private String nameEmployee;



    public double varargsSalary(double...values){

        double res =0;
        for(double x:values){
            res+=x;

        }
        System.out.println(getNameEmployee()+ ""+ res);
        return res;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }
}
