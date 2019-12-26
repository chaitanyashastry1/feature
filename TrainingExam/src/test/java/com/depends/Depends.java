package com.depends;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Depends {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is Before Suite");
    }

    @Test(enabled = false)
    public void test(){
        System.out.println(" This is test");
    }

    @Test(timeOut = 5000)
    public void insert() {
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("inserting demo data");
    }

    @Test(dependsOnMethods="insert")
    public void select() {
        System.out.println("selecting demo data");
    }

    @Test(dependsOnMethods="select")
    public void update() {
        System.out.println("updating demo data");
    }

    @Test(dependsOnMethods={"insert","update"})
    public void delete() {
        System.out.println("deleting demo data");
    }
}



