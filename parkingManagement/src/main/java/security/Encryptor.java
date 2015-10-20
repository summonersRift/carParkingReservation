package security;

/*
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern. 
 In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.
 
 * http://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 * */

public interface Encryptor {
	
	byte[] encrypt(String text,String key);

	String decrypt(String text,String key);

}
