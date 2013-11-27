package swt;

import java.awt.Point;
import java.awt.geom.Point2D;

public class Viereck {
    private Point2D.Double a;
    private Point2D.Double b;
    private Point2D.Double c;
    private Point2D.Double d;

    public Viereck(Point2D.Double a, Point2D.Double b, Point2D.Double c, Point2D.Double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public Viereck(Point a, Point b, Point c, Point d) {
        this.a.x = a.x;
        this.a.y = a.y;
        this.b.x = b.x;
        this.b.y = b.y;
        this.c.x = c.x;
        this.c.y = c.y;
        this.d.x = d.x;
        this.d.y = d.y;
    }

    public boolean isQuadrat() {
        if ((a.x == b.x) && (a.y == d.y) && (b.y == c.y) && (c.x == d.x)) {
            double ab = Math.abs(a.y - b.y);
            double bc = Math.abs(b.x - c.x);
            double cd = Math.abs(c.y - d.y);
            double da = Math.abs(d.x - a.x);
            if (ab == bc && cd == da && bc == cd) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isParallelogramm() {
    	if ((a.y == d.y) && (b.y == c.y)) {
			if((a.x-b.x) == (d.x-c.x)) {
				return true;
			}
		}
    	return false;
    }
    
    public boolean isViereck() {
    	if ((a.y == d.y) && (b.y == c.y)) {
			return true;
		}
    	return false;
    }
    
    public boolean isRechteck() {
        if ((a.x == b.x) && (a.y == d.y) && (b.y == c.y) && (c.x == d.x)) {
        	double ab = Math.abs(a.y - b.y);
        	double bc = Math.abs(b.x - c.x);
        	double cd = Math.abs(c.y - d.y);
        	double da = Math.abs(d.x - a.x);
            if ((ab == cd) && (da ==bc)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isTrapez() {
    	if ((a.y == d.y) && (b.y == c.y)) {
			return true;
		}
    	return false;
    }
}
   