package aStarAlgorithm.astar;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Snapshot per step. Used for visualization of the steps (open/closed set; f,g,h values) in the A* path.
 */
public class AStarSnapshot {

	@SuppressWarnings("rawtypes")
	Set<AStarCell> openset = new HashSet<>();
	@SuppressWarnings("rawtypes")
	Set<AStarCell> closedset = new HashSet<>();
	
	@SuppressWarnings("rawtypes")
	public AStarSnapshot( Collection<AStarCell> open, Collection<AStarCell> closed) {
		
		for( AStarCell cell: open) {
			openset.add( cell.clone());
		}
		for( AStarCell cell: closed) {
			closedset.add( cell.clone());
		}
	}

	@SuppressWarnings("rawtypes")
	public Set<AStarCell> getOpenset() {
		return openset;
	}

	@SuppressWarnings("rawtypes")
	public void setOpenset(Set<AStarCell> openset) {
		this.openset = openset;
	}

	@SuppressWarnings("rawtypes")
	public Set<AStarCell> getClosedset() {
		return closedset;
	}

	@SuppressWarnings("rawtypes")
	public void setClosedset(Set<AStarCell> closedset) {
		this.closedset = closedset;
	}
	
	
}
