package behavioral.observer;

public interface Observer {

    //method to update observer, used by subject
    void update();

    //attach with subject to observe
    void setSubject(Subject subject);
}
