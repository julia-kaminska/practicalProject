package practicalProject.model;

import javax.persistence.*;

@Entity
public class Plane {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column (name = "Plane_model")
    private String PlaneModel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaneModel() {
        return PlaneModel;
    }

    public void setPlaneModel(String planeModel) {
        PlaneModel = planeModel;
    }

    public Plane(int id, String planeModel) {
        this.id = id;
        PlaneModel = planeModel;

    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", PlaneModel='" + PlaneModel + '\'' +
                '}';
    }


}