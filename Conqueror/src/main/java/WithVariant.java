/**
 * Created by 1 on 29.03.2015.
 */
public class WithVariant extends Question {
    private String[] variants ;
    private int rightIndex ;

    public WithVariant() {
    }
    //Getters + Setters


    public String[] getVariants() {
        return variants;
    }

    public void setVariants(String[] variants) {
        this.variants = variants;
    }

    public int getRightIndex() {
        return rightIndex;
    }

    public void setRightIndex(int rightIndex) {
        this.rightIndex = rightIndex;
    }
}
