package org.example.session_04.staticmembers;

class Person {
    public static int i = 10;
    public int j = 20;

    public static void doSomething() {
        i++;
        System.out.println(i);
    }

    public void aVoid(){
        doSomething();
        j++;
        System.out.println(j);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.aVoid();
        Person person1 = new Person();
        person1.aVoid();
    }
}