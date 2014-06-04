Collections
===========
Many times, especially in NLP and IR, we need a mapping data structure which does some counting.
Java's Maps implementations though do not offer that functionality.

Example
===========

Dictionary \<String, Integer\> dict = new Dictionary\<String, Integer\>();</br>
dict.put("Word", 1);</br>
dict.put("Word", 3);

The above code snippet will not replace Word's value with 3, but instead it's going to add the new value to the old one.
