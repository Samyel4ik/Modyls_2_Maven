import java.util.List;

public class Props {

    public static void main(String[] args) {
        ApplicationConfig applicationConfig = new ApplicationConfig("application.properties");
        String suffix = applicationConfig.getSuffix();

        for (String nameFile : applicationConfig.getFileNames()) {

            RenamableFile renamableFile = new RenamableFile(nameFile);
            renamableFile.appendSuffix(suffix);

            System.out.println(nameFile + "->" + renamableFile.appendSuffix(suffix));
        }
    }
}
