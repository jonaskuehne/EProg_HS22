import java.util.*;

public interface Pager {

	public void register(String name);
	
	public List<Message> inbox(); 
	
	public void command(String destination, Message msg);
	
	public Map<Pager, Integer> getSentTo();
}

