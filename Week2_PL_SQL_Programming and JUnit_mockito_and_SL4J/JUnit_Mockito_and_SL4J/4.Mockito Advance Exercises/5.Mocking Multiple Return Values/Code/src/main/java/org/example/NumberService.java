package org.example;

public class NumberService {
    private final NumberGenerator generator;

    public NumberService(NumberGenerator generator) {
        this.generator = generator;
    }

    public int sumNextThreeNumbers() {
        return generator.getNext() + generator.getNext() + generator.getNext();
    }
}
