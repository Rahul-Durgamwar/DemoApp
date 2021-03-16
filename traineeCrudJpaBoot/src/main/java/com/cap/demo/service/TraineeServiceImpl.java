package com.cap.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.entity.Trainee;
import com.cap.demo.repository.TraineeDao;


@Service("service") // TraineeServiceImpl service=new TraineeServiceImpl()
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao dao;

	public Trainee addTrainee(Trainee trainee) {
		return dao.save(trainee);
	}

	public Trainee updateTrainee(Trainee trainee) {
		return dao.save(trainee);
	}

	public void removeTrainee(int traineeId) {
		dao.deleteById(traineeId);
	}

	public Optional<Trainee> getTraineeById(int traineeId) {
		return dao.findById(traineeId);
	}

	public List<Trainee> getAllTrainees() {

		return dao.findAll();
	}

}
