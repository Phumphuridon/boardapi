package com.Boardzone.boardapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "imageset")
public class ImageSetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageset_id;

    @Lob // Specifies that the column will hold large objects
    @Column(name = "image1", columnDefinition = "MEDIUMBLOB", nullable = false)
    private byte[] image1;

    @Lob // Specifies that the column will hold large objects
    @Column(name = "image2", columnDefinition = "MEDIUMBLOB", nullable = false)
    private byte[] image2;

    @Lob // Specifies that the column will hold large objects
    @Column(name = "image3", columnDefinition = "MEDIUMBLOB", nullable = false)
    private byte[] image3;

    @Lob // Specifies that the column will hold large objects
    @Column(name = "image4", columnDefinition = "MEDIUMBLOB", nullable = false)
    private byte[] image4;

    @Lob // Specifies that the column will hold large objects
    @Column(name = "image5", columnDefinition = "MEDIUMBLOB", nullable = false)
    private byte[] image5;

    // Optional: Uncomment if you want a bidirectional relationship
    /*
    @OneToOne(mappedBy = "imageSet")
    private BoardGameEntity boardGame;
    */

    // Getters and Setters
    public int getImageset_id() {
        return imageset_id;
    }

    public void setImageset_id(int imageset_id) {
        this.imageset_id = imageset_id;
    }

    public byte[] getImage1() {
        return image1;
    }

    public void setImage1(byte[] image1) {
        this.image1 = image1;
    }

    public byte[] getImage2() {
        return image2;
    }

    public void setImage2(byte[] image2) {
        this.image2 = image2;
    }

    public byte[] getImage3() {
        return image3;
    }

    public void setImage3(byte[] image3) {
        this.image3 = image3;
    }

    public byte[] getImage4() {
        return image4;
    }

    public void setImage4(byte[] image4) {
        this.image4 = image4;
    }

    public byte[] getImage5() {
        return image5;
    }

    public void setImage5(byte[] image5) {
        this.image5 = image5;
    }
}
