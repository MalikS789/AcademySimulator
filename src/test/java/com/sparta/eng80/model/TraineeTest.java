package com.sparta.eng80.model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TraineeTest {

    @Test
    public void createUniqueTraineeTest() {
        Trainee trainee1 = new Trainee();
        Trainee trainee2 = new Trainee();
        Assertions.assertNotSame(trainee1, trainee2);
    }

}
