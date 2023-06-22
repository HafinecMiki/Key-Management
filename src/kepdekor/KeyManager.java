package kepdekor;

import java.util.Arrays;

public class KeyManager {
	
	private int[] rooms;
	
	public KeyManager() {
		rooms = new int[100];
	}
	
	public void getRooms() {
		System.out.println(Arrays.toString(rooms));
	}
	
	public int getKey() {
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] == 0) {
				rooms[i] = 1;
				return i;
			}
		}
		
		System.out.println("Jelenleg sajnos nincs szabad szoba.");
		return -1;
	}

	public void releaseKey(int id) {
		if(id >= 0 && id < rooms.length) {
			if(rooms[id] == 1) {
				rooms[id] = 0;
				System.out.println("Sikeresen felszabaditva a " + id + " szoba.");
			}
			else {
				System.out.println("Sikertelen, a " + id + " szoba üres.");
			}
		}
		else {
			System.out.println("Sikertelen, a " + id + " szoba nem talalhato.");
		}
	}
}
