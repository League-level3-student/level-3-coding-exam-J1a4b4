import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {

	int commonKeyValuePairs(HashMap<String, String> hI, HashMap<String, String> hII) {
		int counter = 0;
		Set<String> sI = hI.keySet();
		Set<String> sII = hII.keySet();
		String[] keysI = new String[sI.size()];
		String[] keysII = new String[sII.size()];
		sI.toArray(keysI);
		sI.toArray(keysII);
		for (int i = 0; i < hI.size(); i++) {
			if (keysI[i].equals(keysII[i]) && hI.get(keysI[i]).equals(hII.get(keysII[i]))) {
				counter++;
			}
		}
		return counter;
	}
}
