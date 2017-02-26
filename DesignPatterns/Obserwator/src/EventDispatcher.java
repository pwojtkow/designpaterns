import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventDispatcher {

	static Map<String, List<Plugin>> mappedPlugins = new HashMap<String, List<Plugin>>();
	static List<Plugin> plugins = new ArrayList<Plugin>(0);
	
	
	public static void connect(String nazwaZdarzenia, Plugin plugin) {
		plugins.add(plugin);
		mappedPlugins.put(nazwaZdarzenia, plugins);
	}
	
	public static void dispatch(String nazwaZdarzenia, String[] args) {
		List<Plugin> assignPlugins = mappedPlugins.get(nazwaZdarzenia);
		for (Plugin p : assignPlugins) {
			p.update(args);
		}
	}
}
