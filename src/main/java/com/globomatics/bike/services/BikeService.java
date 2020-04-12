package com.globomatics.bike.services;

import com.globomatics.bike.models.Bike;

import java.util.List;

public interface BikeService {

    List<Bike> findAll();
    void create(Bike bike);
    Bike getOne(Long id);
}
