package evoTest.repositories;

import java.util.List;

import evoTest.models.Professor;
import evoTest.models.Room;

public interface RoomRepository {
	
	public void criarSala(Room room);
	public List<Room> listarSalas();
	public Room findSalaById(int id);
	public void deletarSala(int id);
}
