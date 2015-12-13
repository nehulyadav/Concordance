import java.util.Map;
import java.util.Scanner;

//Main class for the Concordance program.

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file name");
		String response = scan.nextLine();
		//readFile(response);
		Concordance concordance = new Concordance(response);
		System.out.println(concordance);
		//Map<String,Integer> hashMap1 = generateConcordance();
		//Map<String,List<Integer>> hashMap = listOfLines ();


		/*Iterator<Entry<String, List<Integer>>> it = hashMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey());
			System.out.print("lines : ");
			//for (int i = 0; i < L.size(); i++) {
			//System.out.println(L.get(i));			}
			it.remove();
		}
		Iterator<Entry<String,Integer>> it1 = hashMap1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println("total : " + pair.getKey());
			it.remove();
		}*/
	}


}