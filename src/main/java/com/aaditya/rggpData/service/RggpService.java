package com.aaditya.rggpData.service;

import com.aaditya.rggpData.model.Rggp;
import com.aaditya.rggpData.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class RggpService {

    @Autowired
    Repo repo;

    public List<Rggp> getAllData() {
        return repo.findAll();
    }

    public Rggp getData(long roll) {
        return repo.findById(roll).orElse(null);
    }

    public void addData(Rggp data , MultipartFile multipartFile) throws IOException {
        data.setImageData(multipartFile.getBytes());
        data.setImageName(multipartFile.getOriginalFilename());
        data.setImageType(multipartFile.getContentType());
        repo.save(data);
    }

    public Rggp updateData(Rggp data , long roll, MultipartFile imageFile) throws IOException {
        data.setImageName(imageFile.getOriginalFilename());
        data.setImageType(imageFile.getContentType());
        data.setImageData(imageFile.getBytes());
        return repo.save(data);
    }

    public void deleteData(long roll) {
        repo.deleteById(roll);
    }

}
