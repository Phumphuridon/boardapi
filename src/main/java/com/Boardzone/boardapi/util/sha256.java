/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.util;

import java.security.MessageDigest;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author phump
 */
public class sha256 {
    private static MessageDigest digester;

    static {
        try{
            digester = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException ex){
            ex.printStackTrace();
        }
    }
    
    public static String hash2sha256(String msg){
        byte[] hash = null;
        if (digester != null){
            hash = digester.digest(msg.getBytes(Charset.defaultCharset()));
        }
        return String.format("%x", new BigInteger(1, hash));
    }
}
