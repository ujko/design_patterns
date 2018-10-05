package zadania.zadanie4;

public abstract class LearningTemplate {
    public void learn() {
        readingLearn();
        countingLearn();
        timeLearn();
        writingLearn();
    }

    protected abstract void readingLearn();

    protected abstract void countingLearn();

    private void timeLearn() {
        System.out.println("Learning time");
    }

    protected void writingLearn(){
        System.out.println("learning writing");
    }


}
