package org.example;

import java.util.Random;

public class Course {
    private int id;
    private String title;
    private int duration;

    private static final String[] titles = new String[] { "statistics", "management", "philosophy", "natural science", "history", "finance", "marketing"};
    private static final Random random = new Random();


    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public Course() {
    }

    public Course(int id, String title, int duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public static Course create() {
        return new Course(titles[random.nextInt(titles.length)], random.nextInt(6, 9) * 10);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    public void updateDuration(){
        duration = random.nextInt(60, 90);
    }

    public void updateTitle(){
        title = titles[random.nextInt(titles.length)];
    }
}
