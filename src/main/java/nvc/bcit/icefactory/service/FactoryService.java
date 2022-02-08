package nvc.bcit.icefactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.icefactory.model.Factory;
import nvc.bcit.icefactory.repository.FactoryRepository;

@Service
public class FactoryService {
    @Autowired
    private FactoryRepository factoryRepository;
    //Get
    public List<Factory> getAllfactories(){
        return factoryRepository.findAll();
    }
    //Get By Id
    public Factory getFactoryById(int id){
        return factoryRepository.getById(id);
    }
}
