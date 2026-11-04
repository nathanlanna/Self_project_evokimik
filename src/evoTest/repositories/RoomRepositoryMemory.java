package evoTest.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import evoTest.models.Room;

public class RoomRepositoryMemory implements RoomRepository {
	
	private Map<Integer,Room> salas = new HashMap<Integer, Room>();
	
	@Override
	public void criarSala(Room room) {
		// TODO Auto-generated method stub
		salas.put(room.getId(), room);
	}

	@Override
	public List<Room> listarSalas() {
		// TODO Auto-generated method stub
		return List.copyOf(salas.values());
	}

	@Override
	public Room findSalaById(int id) {
		// TODO Auto-generated method stub
		return salas.get(id);
	}

	@Override
	public void deletarSala(int id) {
		// TODO Auto-generated method stub
		salas.remove(id);
		
	}

}
