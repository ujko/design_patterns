package zadania.zadanie4;

public class Test {

    public static void main(String[] args) {
        LearningTemplate template = new SlowLearn();
        template.learn();

        template = new MiddleLearning();
        template.learn();

        template = new HighLearning();
        template.learn();
    }
}
