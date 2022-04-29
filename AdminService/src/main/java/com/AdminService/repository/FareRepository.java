package com.AdminService.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AdminService.models.*;


@Repository
public interface FareRepository extends MongoRepository<TrainDetails, Integer>
{
	public TrainDetails findByFlightNo(int flightNo);
	public TrainDetails[] findByStartPointAndEndPointAndTraintDate(String startPoint, String endPoint,String trainDate);
}
}
