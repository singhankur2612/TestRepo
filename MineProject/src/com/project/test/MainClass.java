package com.project.test;

public class MainClass {
	public static void main(String[] args){
		final String secretKey = "AnkurSingh";
	     
	    String originalString = "Test";
	    String encryptedString = EncryptDecrypt.encrypt(originalString, secretKey) ;
	    String decryptedString = EncryptDecrypt	.decrypt(encryptedString, secretKey) ;
	     
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
    }

}
