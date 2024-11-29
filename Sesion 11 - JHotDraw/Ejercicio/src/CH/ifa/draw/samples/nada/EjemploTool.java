package CH.ifa.draw.samples.nada;

import CH.ifa.draw.framework.DrawingView;
import CH.ifa.draw.framework.Figure;
import CH.ifa.draw.framework.HJDError;
import CH.ifa.draw.standard.CreationTool;

public class EjemploTool extends CreationTool{

    public EjemploTool(DrawingView view, Figure prototype) {
        super(view, prototype);
        // TODO Auto-generated constructor stub
    }

    public EjemploTool(DrawingView view) {
        super(view);
        // TODO Auto-generated constructor stub
    }

    protected Figure createFigure() {
        return new EjemploFigura();
    }

}
