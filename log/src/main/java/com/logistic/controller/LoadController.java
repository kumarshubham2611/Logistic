package com.logistic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.logistic.Load;
import com.logistic.LoadRequest;
import com.logistic.service.LoadService;

import java.util.List;

@RestController
@RequestMapping("/load")
public class LoadController {
    private final LoadService loadService;

    @Autowired
    public LoadController(LoadService loadService) {
        this.loadService = loadService;
    }

    @PostMapping
    public String addLoad(@RequestBody LoadRequest loadRequest) {
        Load load = loadService.addLoad(loadRequest);
        return "Load details added successfully";
    }

    @GetMapping
    public List<Load> getLoadsByShipperId(@RequestParam("shipperId") String shipperId) {
        return loadService.getLoadsByShipperId(shipperId);
    }

    @GetMapping("/{loadId}")
    public Load getLoadById(@PathVariable("loadId") String loadId) {
        return loadService.getLoadById(loadId);
    }

    @PutMapping("/{loadId}")
    public String updateLoad(@PathVariable("loadId") String loadId, @RequestBody LoadRequest loadRequest) {
        Load load = loadService.updateLoad(loadId, loadRequest);
        return "Load updated successfully";
    }

    @DeleteMapping("/{loadId}")
    public String deleteLoad(@PathVariable("loadId") String loadId) {
        loadService.deleteLoad(loadId);
        return "Load deleted successfully";
    }
}
