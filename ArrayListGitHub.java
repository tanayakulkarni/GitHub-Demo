import java.util.ArrayList;
public class ArrayListGitHub{
	public static void main(String args[]){
	ArrayList<Integer> list1= new ArrayList<>();
	ArrayList<Integer> list2= new ArrayList<>();
	for(int i=0;i<10; i+=2){
	list1.add(i);
	list2.add(i);
}
System.out.println(returnArrayList(list1, list2));
	printList(list1);
}
	public static ArrayList<Integer> returnArrayList(ArrayList<Integer> listone, ArrayList<Integer> listtwo){
		ArrayList<Integer> listReturn= new ArrayList<>();
		for(int i=0; i<listone.size(); i++){
			listReturn.add(listone.get(i));
	}
	for(int i=0; i<listtwo.size(); i++){
				listReturn.add(listtwo.get(i));
	}
		return listReturn;
}
	public static void printList(ArrayList<Integer> listone){
		for(int i=0; i<listone.size(); i++){
			System.out.print(listone.get(i)+",");
		}
	}
}