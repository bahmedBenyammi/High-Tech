package com.example.server.RepositoryInterFace;

import com.example.server.Model.Addresse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddresseRepository extends MongoRepository<Addresse,String> {

}
