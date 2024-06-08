package com.example.cours;

import jakarta.persistence.*;

@Entity

@Table(name= "coursreligion")
public class Media {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private String imageurl;
    private String videourl;

    public Media() {
    }

    public Media(String imageUrl, String videoUrl) {
        this.imageurl = imageurl;
        this.videourl = videourl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }
}