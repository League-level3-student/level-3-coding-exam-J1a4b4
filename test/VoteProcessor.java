
import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		int votesI = 0;
		int votesII = 0;
		String candidateI = "";
		String candidateII = "";
		boolean same = true;
		for (int i = 0; i < votes.size(); i++) {
			votes.set(i, votes.get(i).toLowerCase());
			if (i < votes.size() - 1) {
				if (!votes.get(i).equals(votes.get(i + 1))) {
					candidateI = votes.get(i).toLowerCase();
					candidateII = votes.get(i + 1).toLowerCase();
					same = false;
				}
			}
		}
		if (same == true) {
			return votes.get(0);
		}
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equals(candidateI)) {
				votesI++;
			}else if (votes.get(i).equals(candidateII)) {
				votesII++;
			}
		}
		if (votesI == votesII) {
			return "TIE";
		}else if (votesI > votesII) {
			return candidateI;
		}
		return candidateII;
	}

}
