///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.Boardzone.boardapi.entity;
//
//import jakarta.persistence.*;
//
//
//
///**
// *
// * @author phump
// */
//@Entity
//@Table(name="UserDemo")
//public class UserDemo {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String fname;
//    private String lname;
//    
//    @Lob
//    @Column(columnDefinition = "BLOB")
//    private byte[] pic;
//
//    public UserDemo() {
//    }
//
//    public UserDemo(String fname, String lname) {
//        this.fname = fname;
//        this.lname = lname;
//    }
//
//    public UserDemo(String fname, String lname, byte[] pic) {
//        this.fname = fname;
//        this.lname = lname;
//        this.pic = pic;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//    
//    public String getFname() {
//        return fname;
//    }
//
//    public void setFname(String fname) {
//        this.fname = fname;
//    }
//
//    public String getLname() {
//        return lname;
//    }
//
//    public void setLname(String lname) {
//        this.lname = lname;
//    }
//
//    public byte[] getPic() {
//        return pic;
//    }
//
//    public void setPic(byte[] pic) {
//        this.pic = pic;
//    }
//}
