package com.capgemini.wsb.fitnesstracker.training.internal;

import com.capgemini.wsb.fitnesstracker.training.api.Training;
import com.capgemini.wsb.fitnesstracker.training.internal.ActivityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

interface TrainingRepository extends JpaRepository<Training, Long> {
    List<Training> findByUserId(Long userId);

    @Query("SELECT t FROM Training t WHERE t.endTime > :date")
    List<Training> findByDateAfter(@Param("date") Date date);

    List<Training> findByActivityType(ActivityType activityType);
}
