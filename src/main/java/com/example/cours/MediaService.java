package com.example.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediaService {


    private final MediaRepository mediaRepository;

    @Autowired
    public MediaService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }

    public Optional<Media> getMediaById(Long id) {
        return mediaRepository.findById(id);
    }

    public Media addMedia(Media media) {
        return mediaRepository.save(media);
    }

    public Media updateMedia(Long id, Media media) {
        if (mediaRepository.existsById(id)) {
            media.setId(id); // Assurez-vous que l'ID est défini correctement pour la mise à jour
            return mediaRepository.save(media);
        } else {
            throw new RuntimeException("Media not found with id: " + id);
        }
    }

    public void deleteMedia(Long id) {
        mediaRepository.deleteById(id);
    }

}
