package org.example.session_03;

import java.util.Objects;

// class keyword + class Name
// access level  : private , protected , package , public
 class Time {
     private int hour; // state , field
     private int min;
     private int sec;

     //constructor method
    public Time(int h , int m , int s){
        hour = h;
        min = m;
        sec = s;
    }
    // setter
    public void setHour(int hour) {
        if(hour >= 0 && hour< 24) {
            this.hour = hour;
        }
    }
    // getter
    public int getHour() {
        return hour;
    }
        // ref1 == ref2 ? true -- > memory address(ref1) = address(ref2)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // ref check
        if (o == null || getClass() != o.getClass()) return false; //
        Time time = (Time) o; // biz
        return hour == time.hour &&
                min == time.min &&
                sec == time.sec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, min, sec);
    }

    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", min=" + min +
                ", sec=" + sec +
                '}';
    }
}
