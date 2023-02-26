package practicalProject.model;

import javax.persistence.*;

@Entity
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column (name = "plane_model" )
    private String planeModel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public Plane(int id, String planeModel) {
        this.id = id;
        this.planeModel = planeModel;
    }

    public Plane(String planeModel) {
        this.planeModel = planeModel;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", planeModel='" + planeModel + '\'' +
                '}';
    }
}
