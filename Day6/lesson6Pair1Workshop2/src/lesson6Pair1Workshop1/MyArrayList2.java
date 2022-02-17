package lesson6Pair1Workshop1;

public class MyArrayList2 {

	//real
	
	private Integer[] myArray;		//dizimiz	(array)	
	private int size = 5;			//ilk boyutu (first length)
	private int index = 0;			//o anki indeksi gosterir (current index)
	
	public MyArrayList2() {
		super();
	}
	
	public MyArrayList2(int size) {
		super();
		this.size = size;
	}
	
	public void add(int value) {
		if(index==0) {
			myArray = new Integer[size];
			System.out.println("Dizi olu�turuldu, boyutu: "+size);
		}
		if(index==size) {
			createNewArray();
		}
		myArray[index] = value;
		System.out.println("De�er eklendi");
		this.index +=1;
	}
	
	public void add(int indis, int value) {
		if(indis>=size) {
			System.out.println("Dizi d��� bir de�er girildi!");
		}else { 
			if(index==size) {
				createNewArray();
			}
			for(int i = index;i>indis;i--) {
				myArray[i] = myArray[i-1];
			}
			myArray[indis]=value;
			System.out.println("De�er"+indis+". indise eklendi");
			this.index +=1;
		}
	}
	
	public void remove() {
		if(index==0) {
			System.out.println("Dizi bo� oldu�u i�in temizlenemez");
		}else {
			myArray[index-1]=null;
			index -= 1;
		}
	}
	
	public void remove(int indis) {
		if(index == 0 || indis < 0 || indis >= index) {
			System.out.println("Ge�ersiz de�er girilidi, i�lem ba�ar�s�z");
		}else {
			for(int i=indis;i<index;i++) {
				myArray[i]= myArray[i+1];
			}
		}
	}
	
	
	public void createNewArray() {
		size = size *3/2;
		System.out.println("Ta�ma ya�and� yeni dizi olu�turuluyor boyutu: "+size);
		Integer[] newArray = new Integer[size];
		for(int i=0;i<myArray.length;i++) {
			newArray[i]=myArray[i];
		}
		myArray = newArray;
		System.out.println("Dizi olu�turuldu,kopyaland�, boyutu: "+size);
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		String value ="";
		for(Integer i : myArray) {
			if(i==null) {
				//break;			//onemli detay
				value +=Integer.toString(0)+",";
			}else {
				value +=Integer.toString(i)+",";
			}
		}
		value = value.substring(0, value.length()-1);
		return "Dizi : ["+ value+"]";
		
	}
}
