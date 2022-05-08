/**
 * Purpose: Forest subclass
 * @author Iker Perez-Calderon
 * @version 3/24/2022
 */
public class Forest extends Terrain {
    private int treesAmount;
    private int treesHeight;

    public Forest(int l, int w, int treesAmount, int treesHeight) {
        super(l, w);
        this.treesAmount = treesAmount;
        this.treesHeight = treesHeight;
    }

    public int getTreesAmount() {
        return treesAmount;
    }

    public int getTreesHeight() {
        return treesHeight;
    }

    public String getForest() {
        return "Forest " + super.getTerrainSize() + ", and with " + treesAmount + " trees at " + treesHeight + " height";
    }
}