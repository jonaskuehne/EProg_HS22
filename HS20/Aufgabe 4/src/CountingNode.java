
import java.util.*;

// Sie duerfen alles an dieser Klasse aendern,
// ausser dem Namen der Klasse und der Signatur des Konstruktors und der getSum Methode.

// just extend RoutingNode
public class CountingNode extends RoutingNode /* Sie koennen auch implements und extends aendern. */ {

	CountingNode(Map<Integer, Node> routingTable) {
		super(routingTable);
	}

	private int sum = 0;

	public int getSum() {
		return sum;
	}

	@Override
	public void process(Message msg) {
		// is IntMessage
		if (msg instanceof IntMessage) {
			// very safe type casting
			sum += ((IntMessage) msg).payload;
		}
	}
}
