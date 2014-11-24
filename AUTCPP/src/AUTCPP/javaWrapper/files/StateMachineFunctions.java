package AUTCPP.javaWrapper.files;

import org.eclipse.uml2.uml.*;

import java.util.ArrayList;
import java.util.List;

public class StateMachineFunctions {

public List<String> PureTransitions(StateMachine aStateMachine) {	
	List<String> names = new ArrayList<String>();
	for (Region rg : aStateMachine.getRegions()) {
		for(Transition tr : rg.getTransitions()) {
			if (tr.getName() != "") {
				if (! names.contains(tr.getName()) ) {
					names.add(tr.getName());
				}
			}
		}
	}
	return names;
}

}