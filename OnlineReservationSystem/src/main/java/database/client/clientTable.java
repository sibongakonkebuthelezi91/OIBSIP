package database.client;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class clientTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long clientId;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;


    public clientTable(){}

    public clientTable(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }


}
