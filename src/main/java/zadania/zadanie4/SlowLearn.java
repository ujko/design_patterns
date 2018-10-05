package zadania.zadanie4;

public class SlowLearn extends LearningTemplate {
    @Override
    protected void readingLearn() {
        System.out.println("learning letter by letter");
    }

    @Override
    protected void countingLearn() {
        System.out.println("learning on fingers");
    }

    @Override
    protected void writingLearn() {
        System.out.println("learning letters");
    }
}
