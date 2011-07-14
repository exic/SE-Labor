

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Knows its observers. Any number of Observer objects
 * may observe a subject. Provides an interface for attaching
 * and detaching Observer objects.
 * @role __Subject
 */

public class Subject {

	private ArrayList<IObserver> observers = new ArrayList<IObserver>();
	private int state = 0; 
	
	public int getState() {   
		return state;
	} 
	
	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}
	

	public void attach(IObserver observer) {
		observers.add(observer);
	}

	public void detach(IObserver observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		Iterator it = observers.iterator();
		while (it.hasNext()) {
			((IObserver) it.next()).update(this);
		}
	}
}