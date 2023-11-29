package ait.pomegranate.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pomegranate implements Iterable<Seed> {
    List<Seed> seeds;

    public Pomegranate() {
        seeds = new ArrayList<>();
    }

    public Pomegranate(List<Seed> seeds) {
        this.seeds = seeds;
    }

    public void setSeeds(List<Seed> seeds) {
        this.seeds = seeds;
    }

    public boolean addSeed(Seed seed) {
        return seeds.add(seed);
    }

    public int quantity() {
        return seeds.size();
    }

    @Override
    public Iterator<Seed> iterator() {
        return seeds.iterator();
    }
}