public class SuperArray {

	private String[] data;
	private int size;

	public SuperArray() {
		data = new String[10];
	}

	public void clear() {
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean add(String element) {
		data[size-1] = element;
		size++;
		return true;
	}

	public String toString() {
		String result = "[";
		for(int i = 0; i <size ; i++) {
			result += " " + data[i];
			if( i != size - 1) {
				result += ",";
			}
		}
		return result + "]";
	}

	public String toStringDebug() {
		String result = "[";
		for(int i = 0; i <data.length; i++) {
			result += " " + data[i];
			if(i != data.length - 1) {
				result += ",";
			}
		}
		return result + "]";
	}

	public String get(int index) {
		if(index < 0 || index >= size()) {
			return null;
		}
		else {
			return data[index];
		}
	}

	public String set(int, String) {

	}

}
