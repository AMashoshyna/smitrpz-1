package com.company;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class HumanTest {
    @Test

    public void evaluateTestExpression() {
        UUID uuid = UUID.randomUUID();
        Human human = new Human(uuid);
        int sum = human.calc(2, 3);
        assertEquals(5, sum);

    }
}