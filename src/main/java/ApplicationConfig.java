import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ApplicationConfig {
    Properties properties;

    public ApplicationConfig(String propertiesFileName) {
        this.properties = loadProperties(propertiesFileName);
    }

    protected static Properties loadProperties(String propertiesFileName) {
        Properties properties = new Properties();
        try (InputStream is = ApplicationConfig.class.getResourceAsStream(propertiesFileName)) {
            properties.load(is);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public String getSuffix() {
        return this.properties.getProperty("suffix");
    }

    public List<String> getFileNames() {
        List<String> list = new ArrayList<>();

        String[] array = this.properties.getProperty("fileNames").split(",");

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }

}
