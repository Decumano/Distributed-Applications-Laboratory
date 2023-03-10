package practice.data.covid;

import java.util.ArrayList;
import java.util.List;

public class CovidRegions {
    private List<CovidRegion> regions;

    public CovidRegions(List<CovidRegion> regions) {
        this.regions = regions;
    }

    public CovidRegions() {
        regions = new ArrayList<CovidRegion>();
    }

    public List<CovidRegion> getregions() {
        return regions;
    }

    public void setregions(List<CovidRegion> regions) {
        this.regions = regions;
    }

    public boolean isEmpty()
    {
        return regions.isEmpty();
    }
}