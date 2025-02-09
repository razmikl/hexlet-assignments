package exercise;

import java.lang.reflect.Field;
// BEGIN
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validator {
    public static List<String> validate(Object obj) {
        var result = new ArrayList<String>();

        try {
            Class<?> aClass = obj.getClass();
            Field[] declaredFiels = aClass.getDeclaredFields();
            for (var field : declaredFiels) {
                field.setAccessible(true);
                String value = (String) field.get(obj);
                if (field.isAnnotationPresent(NotNull.class) && value == null) {
                    result.add(field.getName());
                }
            }
        } catch (IllegalAccessException e) {
            e.fillInStackTrace();
        }
        return result;
    }

    public static Map<String, List<String>> advancedValidate(Object obj) {
        var result = new HashMap<String, List<String>>();
        var newStringList = new ArrayList<String>();

        try {
            Class<?> aClass = obj.getClass();
            Field[] declaredFiels = aClass.getDeclaredFields();
            for (var field : declaredFiels) {
                field.setAccessible(true);
                String value = (String) field.get(obj);
                MinLength annotation = aClass.getAnnotation(MinLength.class);

                if (field.isAnnotationPresent(NotNull.class) && value == null) {
                    newStringList.add("can not be null");
                    result.put(field.getName(), newStringList);
                }
                if (field.isAnnotationPresent(NotNull.class) && value != null) {
                    if (field.isAnnotationPresent(MinLength.class) && annotation.minLength() <= value.length()) {
                        newStringList.add("length less than " + annotation.minLength());
                        result.put(field.getName(), newStringList);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.fillInStackTrace();
        }
        return result;
        }
    }


// END
