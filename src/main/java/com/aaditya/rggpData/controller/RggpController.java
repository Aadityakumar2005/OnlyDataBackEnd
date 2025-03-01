package com.aaditya.rggpData.controller;

import com.aaditya.rggpData.model.Rggp;
import com.aaditya.rggpData.service.RggpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RggpController {

    @Autowired
    RggpService service;

    @GetMapping("/allData")
    public List<Rggp> getAllData(){
        return service.getAllData();
    }

    @GetMapping("/data/{roll}")
    public Rggp getData(@PathVariable long roll){
        return service.getData(roll);
    }

    @PostMapping("/data")
    public void addData(@RequestPart Rggp data, @RequestPart MultipartFile imageFile) throws IOException {
         service.addData(data, imageFile);
    }
    @PutMapping("/data/{roll}")
    public Rggp updateData(@RequestPart Rggp data, @RequestPart MultipartFile imageFile , @PathVariable long roll) throws IOException {
        return service.updateData(data, roll,imageFile);
    }

    @DeleteMapping("/data/{roll}")
    public void deleteData(@PathVariable long roll){
        service.deleteData(roll);
    }

    @GetMapping("/data/{roll}/image")
    public ResponseEntity<byte[]> getImageById(@PathVariable long roll){
        Rggp rggp = service.getData(roll);
        byte[] imageFile = rggp.getImageData();
        return ResponseEntity.ok().contentType(MediaType.valueOf(rggp.getImageType())).body(imageFile);
    }
}
