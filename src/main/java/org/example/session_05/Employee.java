package org.example.session_05;

// Employee is a Person

/*
*  Employee -----> Person ----> Object
*
*
* */
// superclass members : super

public class Employee extends Person{

    private String code;

   private Employee(){
       super();
   }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return " Employee{" + super.toString() +
                "code='" + code + '\'' +
                '}';
    }
}
