package users;

public class Admin {
    String name,family,username,password,email,phone_number;
    int AdminId;

    public String getName() {
        return name;
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

    public String getEmail() {
        return email;
    }

    public Admin(String name, String family, String username, String password, String email, String phone_number, int adminId) {
        this.name = name;
        this.family = family;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        AdminId = adminId;
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

    public int getAdminId() {
        return AdminId;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }

}
