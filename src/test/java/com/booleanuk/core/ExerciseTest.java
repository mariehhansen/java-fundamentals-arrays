package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    public void shouldChange17To68() {
        Assertions.assertEquals(68, this.exercise.one()[2]);
    }

    @Test
    public void shouldBeCarlo() {
        Assertions.assertEquals("Carlo", this.exercise.two());
    }

    @Test
    public void shouldContainCarManufacturers() {
        String[] cars = this.exercise.three();
        Assertions.assertEquals(3, cars.length);
        Assertions.assertEquals("Audi", cars[0]);
        Assertions.assertEquals("BMW", cars[1]);
        Assertions.assertEquals("Dodge", cars[2]);
    }

    @Test
    public void shouldBe163() {
        Assertions.assertEquals(163, this.exercise.four());
    }

    @Test
    public void fiveShouldBeArrayOfFloats() {
        float[] floats = this.exercise.five();
        Assertions.assertEquals(3, floats.length);
        Assertions.assertEquals(9.62f, floats[0]);
        Assertions.assertEquals(23.17f, floats[1]);
        Assertions.assertEquals(3.14f, floats[2]);
    }
}
