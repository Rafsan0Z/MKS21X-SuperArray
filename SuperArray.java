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
		if(size == data.length) {
			resize();
		}
		if(size == 0) {
			data[0] = element;
			size++;
			return true;
		}
		else{
			data[size] = element;
			size++;
			return true;
		}
	}

	public String toString() {
		String result = "[";
		for(int i = 0; i <size ; i++) {
			if(i==0) {result += data[0];}
			if(i!=0) {result += " " + data[i];}
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

	public String set(int index, String element) {
		String result;
		if(index < 0 || index >= size()) {
			return null;
		}
		else{
			result = data[index];
			data[index] = element;
		}
		return result;
	}

	 public boolean contains(String target) {
                boolean result = false;
                for(int i = 0; i < size; i++) {
                        if(data[i] == target) {
                                result = true;
                                i = size + 1;
                        }
                }
                return result;
        }

	public int indexOf(String target) {
                int index = 0;
                for(int i = 0; i < size; i++) {
                        if(data[i] == target) {
                                index = i;
                                i = size + 1;
                        }
                }
                return index;
        }

        public int lastIndexOf(String target) {
                int index = 0;
                for(int i = size - 1; i >= 0; i--){
                        if(data[i] == target) {
                                index = i;
                                i = -1;
                        }
                }
                return index;
        }

	private void resize() {
		String[] newdata = new String[data.length+1];
		for(int i = 0; i < newdata.length;i++) {
			if(i == data.length) {}
			else {
				newdata[i] = data[i];
			}
		}
		data = newdata;
	}

	public void add(int index, String element) {
		String[] newdata = new String[data.length+1];
		if(index > size() || index < 0) {
			System.out.println("Error");
		}
		else{
			for(int i = 0; i<newdata.length;i++) {
				if(i < index) {newdata[i] = data[i];}
				if(i == index) {newdata[i] = element;}
				if(i > index) {newdata[i] = data[i-1];}
			}
			size++;
			data = newdata;
		}
        }

	 public String remove(int index) {
                String returnvalue = data[index];
                String[] newdata = new String[data.length - 1];
                for(int i = 0; i <newdata.length ; i++) {
                        if(i < index) {
                                newdata[i] = data[i];
                        }
                        if(i >= index) {
                                newdata[i] = data[i+1];
                        }
                }
                data = newdata;
		size--;
                return returnvalue;
        }

	public boolean remove(String element) {
		String[] newdata = new String[data.length-1];
		if(!contains(element)) {
			return false;
		}
		else {
			int index = indexOf(element);
			remove(index);
			return true;
		}
	}
}
