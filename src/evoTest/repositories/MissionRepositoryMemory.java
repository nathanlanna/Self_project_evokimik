package evoTest.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import evoTest.models.Mission;

public class MissionRepositoryMemory implements MissionRepository {
	
	private final Map<Integer,Mission> missions = new HashMap<>();
	
	@Override
	public void criarMission(Mission mission) {
		// TODO Auto-generated method stub
		missions.put(mission.getId(), mission);
	}

	@Override
	public List<Mission> listarMission() {
		// TODO Auto-generated method stub
		return List.copyOf(missions.values());
	}

	@Override
	public void deleteMission(int id) {
		// TODO Auto-generated method stub
		missions.remove(id);
	}

	@Override
	public Optional<Mission> getMissionById(int id) {
		// TODO Auto-generated method stub
		return Optional.of(missions.get(id));
	}

}
