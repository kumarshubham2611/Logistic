package com.logistic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistic.Load;
import com.logistic.LoadRequest;
import com.logistic.exception.LoadNotFoundException;
import com.logistic.repository.LoadRepository;

import java.util.List;

@Service
public class LoadService {
    private final LoadRepository loadRepository;

    @Autowired
    public LoadService(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }

    public Load addLoad(LoadRequest loadRequest) {
        String loadId = generateLoadId();
        Load load = new Load(loadId, loadRequest);
        return loadRepository.save(load);
    }

    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadRepository.findByShipperId(shipperId);
    }

    public Load getLoadById(String loadId) {
        return loadRepository.findById(loadId)
                .orElseThrow(() -> new LoadNotFoundException("Load not found with ID: " + loadId));
    }

    public Load updateLoad(String loadId, LoadRequest loadRequest) {
        Load load = getLoadById(loadId);
        load.updateLoad(loadRequest);
        return loadRepository.save(load);
    }

    public void deleteLoad(String loadId) {
        loadRepository.deleteById(loadId);
    }

    private String generateLoadId() {
        // Generate and return a unique loadId, such as UUID
        return "load-" + System.currentTimeMillis();
    }
}
