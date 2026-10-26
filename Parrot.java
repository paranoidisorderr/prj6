package lesson.animals;

public class Parrot extends Animal {
    int vocabularySize;

    public void Parrot(String food, String location, int vocabularySize) {
        super(food, location);
        this.vocabularySize = vocabularySize;
    }

    @Override
    public void makeNoise() {
        System.out.println("squawk");
    }

    @Override
    public void eat() {
        System.out.println("eating " + food);
    }

    @Override
    public String toString() {
        return "Parrot [food=" + getFood() + ", location=" + getLocation() + ", vocabularySize=" + vocabularySize + "]";
    }

    public int getVocabularySize() {
        return vocabularySize;
    }

    public void setVocabularySize(int vocabularySize) {
        this.vocabularySize = vocabularySize;
    }
}