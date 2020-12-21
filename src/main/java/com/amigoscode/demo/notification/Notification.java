package com.amigoscode.demo.notification;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Notification {
    private String message;
    private ZonedDateTime   timeStamp;

    public Notification(String message, ZonedDateTime timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public Notification(String message) {
        this.message = message;
    }

    public Notification() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(ZonedDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return message.equals( that.message ) && timeStamp.equals( that.timeStamp );
    }

    @Override
    public int hashCode() {
        return Objects.hash( message, timeStamp );
    }


}
