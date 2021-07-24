public class MapNode <K ,V> {
	K key;
	V value;
    MapNode<K,V> next;
    
	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
    
}
