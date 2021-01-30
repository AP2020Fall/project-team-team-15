package plato.storage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class Database {
    public static String PATH_ADMIN = "C:\\Users\\Sadra\\IdeaProjects\\plato\\admin.txt";
    public static String PATH_USER = "C:\\Users\\Sadra\\IdeaProjects\\plato\\user.txt";

    public Database() {
    }

    private String username = "", password = "";
    private String name, family, email, phone_number;

    public String getName() {
        return name;
    }

    public Database(String username, String password, String name, String family, String email, String phone_number, String path) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.family = family;
        this.email = email;
        this.phone_number = phone_number;
        insert(path);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Database(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void insert(String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true));
            bufferedWriter.write(getUsername() + "//");
            bufferedWriter.write(getPassword() + "//");
            bufferedWriter.write(getName() + "//");
            bufferedWriter.write(getFamily() + "//");
            bufferedWriter.write(getEmail() + "//");
            bufferedWriter.write(getPhone_number() + "//");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String select(String path) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            boolean exists = false;
            while ((line = bufferedReader.readLine()) != null) {
                String[] columns = line.split("//");
                if (columns[0].equals(getUsername()) & columns[1].equals(getPassword())) {
                    exists = true;
                    bufferedReader.close();
                    break;
                }
            }
            if (exists) {
                return "login successful";
            } else {
                return "try again!";
            }
        } catch (IOException e) {
            return e.getMessage();
        }

    }

    public Boolean delete(String path) {
        File inputFile = new File(path);
        File tempFile = new File("myTempFile.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String lineToRemove = getUsername();
            String currentLine;
            while((currentLine = reader.readLine()) != null) {
                String[] columns = currentLine.split("//");
                if (columns[0].equals(lineToRemove)) continue;
                writer.write(currentLine+System.getProperty("\n"));
            }
            writer.close();
            reader.close();
            return tempFile.renameTo(inputFile);
        } catch (IOException e) {
            return false;
        }
    }
}

