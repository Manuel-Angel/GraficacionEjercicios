
package examenu3;

import java.awt.Color;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.IndexedTriangleArray;
import javax.vecmath.Point3f;
import modelos3d.Forma3D;

/**
 *
 * @author Manuel Angel Muñoz S
 */
public class Tetraedro extends Forma3D{
    private float ancho;
    private int []iV; //indices de vertices
    private int []iC; //indices de colores
    public Tetraedro(float ancho, Color co){
        this.ancho=ancho;
        addComponentes(co);
    }
    public Tetraedro(float ancho){
       this(ancho,null);
    }
    @Override
    public void asignarVertices() {
        float r=ancho/2;
        v= new Point3f[]{
          new Point3f(r,r,r),
          new Point3f(r,-r,-r),
          new Point3f(-r,r,-r),
          new Point3f(-r,-r,r),
        };
        iV=new int[]{
            0,1,2, 0,3,1, 1,3,2, 2,3,0
        };
    }

    @Override
    public void asignarColores() {
        iC= new int[]{
            0,0,0, 1,1,1, 2,2,2, 3,3,3
        };
    }

    @Override
    public void crearForma() {
        int mascara=GeometryArray.COORDINATES | GeometryArray.COLOR_3;
        IndexedTriangleArray ita= new IndexedTriangleArray(iV.length, mascara,iV.length);
        ita.setCoordinates(0,v);
        ita.setColors(0,c);
        ita.setCoordinateIndices(0, iV);
        ita.setColorIndices(0, iC);
        setGeometry(ita);
    }    
}
