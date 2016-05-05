/*
	A Symbol Table Class 
	
	04.May.2016 First Version Symbol Table API 
	
	For Duplicate Keys ,keep the newest one 
	
	No NULL keys ,No NULL values 
	
	
	ATTENTION please !!!!
		The Performance Test is the FrequencyCounter class 
	
	------------------------------------------
	
	
	
*/

public class ST<Key extends Comparable<Key>, Value>  implements Iterable<Key>{
	
	//Create a symbol table 
	public ST(){}
	
	
	//put key-value pair into the table
	//(remove key from table if value if null)
	void put(Key key,Value val){}
	
	
	//value paired with key 
	//return null if key is absent 
	Value get(Key key){}
	
	//remove key (and its value ) from table
	void delete(Key key){
		put(key,null)
	}
	
	
	//return is there a value paired with key ?
	boolean contains(Key key){
		return get(key) != null;
	}
	
	//is the table empty?
	boolean isEmpty(){
		return size()==0;
	}
	
	//return number of key-value pairs in the table 
	int size(){}
	
	//return number of key-value pairs in [lo..hi] in the table 
	int size(Key lo,Key hi){
		if(hi.compareTo(lo)<0)
			return 0;
		else if (contains(hi))
			return rank(hi) -rank(lo)+1;
		else
			return rank(hi)-rank(lo);
	}
	
	//return smallest key
	Key min(){}
	
	
	//return largest key
	Key max(){}
	
	//largest key less than or equal to key 
	Key floor(Key key){}
	
	
	//smallest key greater than or equal to key 
	Key ceiling(Key key){}
	
	//number of keys less than key 
	int rank(Key key){}
	
	//key of rank k
	Key select(int k){}
	
	
	//delete smallest key 
	void deleteMin(){
		delete(min());
	}
	
	
	//delete largest key 
	void deleteMax(){
		delete(max());
	}
	
	
	//keys in [lo..hi] ,in sorted order 
	Iterable<Key> keys(Key lo,Key hi){
	}
	
	
	//all the keys in the table,in sorted order 
	Iterable<Key>  keys(){
		return keys(min(),max());
	}
	
	
	
	
	//test for small inputs 
	public static void main(String[] args){
		ST<String,Integer> st;
		st=new ST<String,Integer>();
		
		for(int i=0;!StdIn.isEmpty();i++){
			String key=StdIn.readString();
			st.put(key,i);
		}
		
		for(String s:st.keys())
			StdOut.println(s+" "+st.get(s));
	}//main 
	
	
}//class 