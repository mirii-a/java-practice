package com.example.java_practice.constructors.rectangle;

public class Rectangle {
    private Long length;
    private Long width;

    public Rectangle (Long length, Long width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle (Rectangle rectangle) {
        this(rectangle.length, rectangle.width);
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getLength() {
        return length;
    }

    public Long getWidth() {
        return width;
    }
}
