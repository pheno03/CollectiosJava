package com.exemple.generic;

public class KeyValue<Key, Value> {

	private Key key;
	private Value value;

	/**
	 * @param key
	 * @param value
	 */
	public KeyValue(Key key, Value value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * @return the key
	 */
	public Key getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(Key key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Value value) {
		this.value = value;
	}

}
