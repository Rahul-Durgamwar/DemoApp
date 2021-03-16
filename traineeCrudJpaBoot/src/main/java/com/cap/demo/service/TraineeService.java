package com.cap.demo.service;

import java.util.List;
import java.util.Optional;

import com.cap.demo.entity.Trainee;

public interface TraineeService {

		Trainee addTrainee(Trainee trainee);

		Trainee updateTrainee(Trainee trainee);

		void removeTrainee(int traineeId);

		Optional<Trainee> getTraineeById(int traineeId);

		List<Trainee> getAllTrainees();
	
}
