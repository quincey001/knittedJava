## 1. why inserting and searching for values is O(1) on average in hashtable?.
this is because in an ideal scenario, the hash function would 
distribute keys uniformly across the array indices, so the 
average number of elements stored at any given index would be
low.
when a new key-value pair is added to the hashmap, the hash function is 
used to calculate the index in the array where the pair should be 
stored. because the array is typically much smaller than the number 
of possible keys, the time complexity of this operation is O(1).

## 2. what is chaining technology that used to avoid collision in hashmap?
when two or more keys are mapped to the same index in the table,
each index in the table is a linked list of elements that have the 
same hash value. 
when a new element is inserted into the table and its hash value maps 
to an index that is already occupied, the element is added to the linked list at that index.
（increased memory usage & longer linked list）