package ge.giga;

import java.lang.reflect.Field;
import java.util.Locale;

public class ProcessModifyString {

    public static void doProcess(Object... objects) throws IllegalAccessException {
        for (Object object : objects) {
            Class clazz = object.getClass();
            for (Field declaredField : clazz.getDeclaredFields()) {
                // If not accessible, set to accessible
                if (!declaredField.canAccess(object)) {
                    declaredField.setAccessible(true);
                }

                // Check if annotation is present
                if (!declaredField.isAnnotationPresent(ModifyString.class)) {
                    continue;
                }

                // If field is not String, throw exception
                Object fieldValue = declaredField.get(object);
                if (!String.class.isInstance(fieldValue)) {
                    throw new IllegalArgumentException(object + "is not instance of String!");
                }
                ModifyString modifyString = declaredField.getAnnotation(ModifyString.class);
                String fieldStringValue = (String) fieldValue;

                // Perfrom operations
                if (modifyString.toLowerCase()) {
                    fieldStringValue = fieldStringValue.toLowerCase();
                    declaredField.set(object, fieldStringValue);
                }

                if (modifyString.toUpperCase()) {
                    fieldStringValue = fieldStringValue.toUpperCase();
                    declaredField.set(object, fieldStringValue);
                }

                if (modifyString.trimmed()) {
                    fieldStringValue = fieldStringValue.trim();
                    declaredField.set(object, fieldStringValue);
                }

                if (!modifyString.prefix().isEmpty()) {
                    fieldStringValue = modifyString.prefix().concat(fieldStringValue);
                    declaredField.set(object, fieldStringValue);
                }

                if (!modifyString.suffix().isEmpty()) {
                    fieldStringValue = fieldStringValue.concat(modifyString.suffix());
                    declaredField.set(object, fieldStringValue);
                }
            }
        }
    }
}
