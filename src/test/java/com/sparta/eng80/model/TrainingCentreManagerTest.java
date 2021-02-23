package com.sparta.eng80.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrainingCentreManagerTest {

    @Test
    public void TrainingCentreManagerTest() {
        TrainingCentreManager trainingCentreManager = new TrainingCentreManager(LocalDate.now());
        Assertions.assertNotNull(trainingCentreManager);
    }

    @Test
    public void generateNewCentreTest() {
        TrainingCentreManager trainingCentreManager = new TrainingCentreManager(LocalDate.now());
        trainingCentreManager.generateNewCentre(LocalDate.now());
        Assertions.assertTrue(trainingCentreManager.getListOfTrainingCenters().size() == 1);
    }

    @Test
    public void getNumOfFullTrainingCentresTest() {
        TrainingCentreManager trainingCentreManager = new TrainingCentreManager(LocalDate.now());
        int i = trainingCentreManager.getNumOfFullTrainingCentres();
    }
}
