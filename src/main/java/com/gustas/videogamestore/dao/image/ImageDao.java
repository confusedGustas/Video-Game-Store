package com.gustas.videogamestore.dao.image;

import com.gustas.videogamestore.domain.Image;
import java.util.Optional;

public interface ImageDao {

    Optional<Image> getImage(Long name);
    void save(Image image);

}
