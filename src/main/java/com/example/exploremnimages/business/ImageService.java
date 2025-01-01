package com.example.exploremnimages.business;



import com.example.exploremnimages.model.IdName;
import com.example.exploremnimages.model.Image;
import com.example.exploremnimages.repo.ImageRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {
    private ImageRepository repository;


    public ImageService(ImageRepository repository) {
        this.repository = repository;
    }

    public Image saveImage(Image image) {
        return repository.save(image);
    }

    public Optional<Image> getImage(String id) {
        return repository.findById(id);
    }

    public Optional<Image> findByName(String name) {
        return repository.findByFileName(name);
    }

    public List<IdName> findIdNames() {
        return repository.findIdNameBy();
    }
}
