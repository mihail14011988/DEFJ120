package DEVJ110;


import java.util.Objects;
import java.util.Random;

public class User implements Cloneable {

    private int id;
    private String name;
    private boolean isAdmin;

    public User() {
    }

    public User(int id, String name, boolean isAdmin) throws UserException1 {
        this.id = id;
        {
            if (name == null && name.equals("")) throw new UserException1("Ошибка");
            this.name = name;
            {
                if (id == 15) this.isAdmin = true;
                else this.isAdmin = false;
            }

        }
    }

  @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name != null && name.equals(""))
            this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isAdmin == user.isAdmin && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        int i = isAdmin ? 1 : 0;
       hash = name.hashCode() +i;


        return hash;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            User copy=new User(new Random().nextInt(20),name,isAdmin);
            if (name == null && name.equals("")) throw new CloneNotSupportedException("Ошибка");
            else return copy;

        } catch (UserException1  e) {
            e.printStackTrace();
        }
        return null;
    }
}


