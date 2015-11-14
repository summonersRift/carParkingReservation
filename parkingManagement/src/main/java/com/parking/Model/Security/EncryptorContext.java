package com.parking.Model.Security;

public class EncryptorContext {

	private Encryptor strategy;

	private EncryptorContext(Encryptor strategy) {
		this.strategy = strategy;
	}

	public byte[] executeEncryption(String text, String key) {
		return strategy.encrypt(text, key);
	}

	public String executeDecryption(String text, String key) {
		return strategy.decrypt(text, key);
	}

	public static EncryptorContext getInstance(Encryptor strategy) {

		return new EncryptorContext(strategy);

	}

}
