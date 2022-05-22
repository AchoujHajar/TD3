package exercice1;
import  java.util.ArrayList;




	public class Orchestra {
		private ArrayList<Wind> windArrayList = new ArrayList<>();
		private ArrayList<Percussion> percussionArrayList = new ArrayList<>();

		public void tuneWind(Wind w){
			w.play();
		}

		public void tunePercussion(Percussion p){
			p.play();
		}
		public void tuneAll(){
			for (Percussion p: percussionArrayList) {
				tunePercussion(p);
			}
			for (Wind w: windArrayList) {
				tuneWind(w);
			}

		}

		public void addWind(Wind w){
			windArrayList.add(w);
		}

		public void addPercussion(Percussion p){
			percussionArrayList.add(p);
		}
	}