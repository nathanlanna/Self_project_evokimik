package evoTest.repositories;

import java.util.List;
import java.util.Optional;

import evoTest.models.Mission;

public interface MissionRepository {

	public void criarMission(Mission mission);
	public List<Mission> listarMission();
	public void deleteMission(int id);
	public Optional<Mission> getMissionById(int id);
	
	
}
