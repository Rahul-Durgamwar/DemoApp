package com.cap.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.demo.entity.Trainee;
@Repository
public interface TraineeDao extends JpaRepository<Trainee,Integer> {
	//@Query("select min(id) from trainee")
	//List<Trainee> getLowestID();
}
	
	
	
	
	//int addTrainee(Trainee trainee);

	//Trainee updateTrainee(Trainee trainee);

	//void removeTrainee(int traineeId);

	//Trainee getTraineeById(int traineeId);

	//List<Trainee> getAllTrainees();


