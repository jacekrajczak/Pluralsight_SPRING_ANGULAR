package com.globomatics.bike.services;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BikeServiceImpl implements BikeService{

    private BikeRepository bikeRepository;

    public BikeServiceImpl(BikeRepository bikeRepository){
        this.bikeRepository = bikeRepository;
    }

    @Override
    public List<Bike> findAll() {
        return bikeRepository.findAll();
    }

    @Override
    public void create(Bike bike) {
        bikeRepository.save(bike);
    }

    @Override
    public Bike getOne(Long id) {
        return bikeRepository.getOne(id);
    }
}
