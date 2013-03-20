package clueGame;

public class Player {
		
	private String name;
	private String color;
	private int startLocation;
	//default constructor
		public Player(){
			
		}
		
		public Card disproveSuggestion(String person, String room, String weapon){
			return new Card();
		}
		
		public String getName(){
			return name;
		}
		public String getColor(){
			return color;
		}
		
		public int getStartLocation(){
			return startLocation;
		}
}
