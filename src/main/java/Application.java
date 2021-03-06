public class Application {

    public static void main(String[] args) {
        ApplicationConfig applicationConfig = new ApplicationConfig("application.properties");
        String suffix = applicationConfig.getSuffix();

        for (String nameFile : applicationConfig.getFileNames()) {

            RenamableFile renamableFile = new RenamableFile(nameFile);
            String newNameFile = renamableFile.appendSuffix(suffix);

            System.out.println(String.format("%s->%s", nameFile, newNameFile));
        }
    }
}
