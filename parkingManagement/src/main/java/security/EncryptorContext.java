package security;

public class EncryptorContext {

	private Encryptor strategy;

	public EncryptorContext(Encryptor strategy) {
		this.strategy = strategy;
	}

	public byte[] executeEncryption(String text, String key) {
		return strategy.encrypt(text, key);
	}

	public String executeDecryption(String text, String key) {
		return strategy.decrypt(text, key);
	}
}
