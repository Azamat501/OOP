package Units;

public class CrossBowman extends BaseShooter {
    public CrossBowman( String name, int x, int y ) {
        super( name, "CrossBowman", 10, 6, 3, 4, 2, 3 );
        super.setPos( new Point2D( x, y ) );
        super.ammo = 16;
    }
}