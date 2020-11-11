import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxHeap<Key extends Comparable<Key>, E> {

    private HNode<Key, E>[] heap;
    private final int CAPACITY = 1000;
    private int maxSize;
    private int size=0;

    public MaxHeap() {
        heap = new HNode[CAPACITY];
        maxSize = CAPACITY;
    }

    public MaxHeap(int maxsize) {
        heap = new HNode[maxsize + 1];
        maxSize = maxsize + 1;
    }


    public HNode<Key, E> max() {
        if (size == 0)
            return null;
        return heap[1];
    }

    public void insert(Key k, E value) {
        if (size + 1 < maxSize) {
            heap[++size] = new HNode<Key, E>(k, value);
            upHeap(size);
        } else
            System.out.printf("Can not insert (key = %s , value=%s ), the heap is full! %n",k,value);

    }

    private void upHeap(int i) {

        while (i > 1) {
            int parentIndex = parent(i);
            if (heap[i].getKey().compareTo(heap[parentIndex].getKey()) <= 0)
                return;
            HNode<Key, E> temp = heap[parentIndex];
            heap[parentIndex] = heap[i];
            heap[i] = temp;
            i = parentIndex;
        }

    }

    public HNode<Key, E> removeMax() {
		return null;


    }
    void frequency() throws IOException {
 		Scanner input = new Scanner (System.in);
    	int k, flaq=0; 
    	String filename;
    	System.out.print ("Please enter the file name ");
    	filename =input.next();
    	System.out.print ("Please enter the number of the most frequent words in the file");
    	k =input.nextInt();
    	Scanner scan = new Scanner (Paths.get(filename));
    	System.out.println(scan);
    	ArrayList<words> wordsList= new ArrayList<words>();
    	while(scan.hasNextLine()){
    	String w= scan.next();
    	for(int i = 0; i<= wordsList.size() ; i++){
    	if(wordsList.get(i).getWord().equalsIgnoreCase(w)){
    	int num= wordsList.get(i).getFrequency();
    	wordsList.get(i).setFrequency(num+1);
    	flaq=1;
    	break; 
    	}
    }
    if(flaq==0){
	    words wi=new words(w, 1); 
	    wordsList.add(wi); 
    }}
   }

    // **********************************************
    public boolean isEmpty() {
        return size == 0;
    }

    public int parent(int i) {
        return i / 2;
    }

    public int left(int i) {
        return i * 2;
    }

    public int right(int i) {
        return i * 2 + 1;
    }

    public int size() {
        return size;
    }

    public boolean hasLeft(int i) {
        return (i * 2) <= size;
    }

    public boolean hasRight(int i) {
        return (i * 2 + 1) <= size;
    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            System.out.println("heap[" + i + "]: key = " + heap[i].getKey() + ", value = " + heap[i].getValue());
        }
    }
    public static void main(String[] args) throws IOException {
        MaxHeap <Integer, String> maxheap = new MaxHeap<Integer, String> (5);
        maxheap.insert(2, "two");
        maxheap.insert(3, "three");
        maxheap.insert(1, "one");
        maxheap.insert(4, "four");
        maxheap.insert(5, "five");
        maxheap.insert(6, "six");// can not insert it 
        maxheap.print();
        maxheap.frequency();

    }

}