package com.example.exploremnimages.repo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.exploremnimages.model.IdName;
import com.example.exploremnimages.model.Image;

public interface ImageRepository  extends MongoRepository<Image, String> {
  Optional<Image> findByFileName(String name);
  
  List<IdName> findIdNameBy();
}