package com.capgemini.wsb.fitnesstracker.training.api;

import com.capgemini.wsb.fitnesstracker.training.internal.ActivityType;
import com.capgemini.wsb.fitnesstracker.user.api.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrainingDto {
    private Long id;
    private Long userId;
    private User user;
    private Date startTime;
    private Date endTime;
    private ActivityType activityType;
    private Double distance;
    private Double averageSpeed;

    public TrainingDto(Training training) {
        this.id = training.getId();
        this.user = training.getUser();
        this.startTime = training.getStartTime();
        this.endTime = training.getEndTime();
        this.activityType = training.getActivityType();
        this.distance = training.getDistance();
        this.averageSpeed = training.getAverageSpeed();
    }

    public TrainingDto(Long id, User user, Date startTime, Date endTime, ActivityType activityType, Double distance, Double averageSpeed) {
        this.id = id;
        this.user = user;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activityType = activityType;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }
}
