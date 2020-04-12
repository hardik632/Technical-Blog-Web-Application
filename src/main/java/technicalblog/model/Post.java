package technicalblog.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//POJO CLASS

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @Column(name = "date")
    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private List<Category> categories = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}