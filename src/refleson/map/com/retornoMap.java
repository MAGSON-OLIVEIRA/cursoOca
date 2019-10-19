package refleson.map.com;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class retornoMap {
	public static void main(String[] args) {
		Person person = new Person();
		List<Person2> listPerson = new ArrayList<Person2>();

		Map<String, Object> attributes = getAttributesMap(person);

		for (int i = 1; i <= 6; i++) {
			// System.out.println(key + ": " + attributes.get(key));
			attributes.put("Id" + i, i);
			attributes.put("LastName" + i, "Magson" + i);
			attributes.put("Age" + i, "35" + i);
			attributes.put("Name" + i, "Dias" + i);

			Person2 persion = new Person2(attributes.get("Id" + i).toString(),
					attributes.get("LastName" + i).toString(), attributes.get("Age" + i).toString(),
					attributes.get("Name" + i).toString());
			listPerson.add(persion);

		}
		listPerson.forEach(f -> System.out.println(f.toString()));
	}

	public static Map<String, Object> getAttributesMap(Object obj) {
		Map<String, Object> attributesMap = new HashMap<String, Object>();
		Class<?> objClass = obj.getClass();
		Method[] methods = objClass.getMethods();

		for (Method method : methods) {
			if (method.getName().startsWith("get") && method.getReturnType() != void.class) {
				String attributeName = getAttributeName(method.getName());
				try {
					Object value = method.invoke(obj);
					attributesMap.put(attributeName, value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return attributesMap;
	}

	private static String getAttributeName(String name) {
		return name.substring(3);
	}

}



