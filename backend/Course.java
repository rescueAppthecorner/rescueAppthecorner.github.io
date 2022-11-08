package backend;

import javax.annotation.processing.Generated;

@Entity
//POJO = Plain Old Java Object
public class Course {
    @Id
    @Generated(strategy = GenerationType.AUTO)
    int id;
    
    String name;
    int duration;
    String description;

    public Course() {}
    
    public Course(String name, int duration, String description) {
        this.name = name;
        this.duration = duration;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
