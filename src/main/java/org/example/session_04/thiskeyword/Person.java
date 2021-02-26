package org.example.session_04.thiskeyword;

public class Person {
    private int id;
    private String name;
    private int age;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Person(int age) {
        this(1, "reza");
        this.age = age;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Person) obj).id;
    }

    public boolean checkId(Person person){
        return this.equals(person);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person(1,"ali");
        Person person1 = new Person(1,"reza");
        System.out.println(person.checkId(person1));
    }
}



