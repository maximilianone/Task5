package task5.resources;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;
    private ResourceBundle resourceBundle;
    private final String resourceName = "properties.text";

    private ResourceManager() {
        this.resourceBundle = ResourceBundle.getBundle(resourceName, Locale.getDefault());
    }

    public void changeResource(Locale locale) {
        this.resourceBundle = ResourceBundle.getBundle(resourceName, locale);
    }

    public String getKey(String key) {
        return resourceBundle.getString(key);
    }
}
