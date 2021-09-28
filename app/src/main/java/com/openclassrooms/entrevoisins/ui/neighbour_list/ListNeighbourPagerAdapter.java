package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.List;


public class ListNeighbourPagerAdapter extends FragmentPagerAdapter {

    public ListNeighbourPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * getItem is called to instantiate the fragment for the given page.
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return NeighbourFragment.newInstance();
        } else {
            return NeighbourFavoriteFragment.newInstance();
        }
    }

    /**
     * get the number of pages
     * @return
     */
    @Override
    public int getCount() {
        return 2;

        boolean isFavoris = neighbours.get(0).isFavorite(true);
        neighbours.get(0).setFavorite(true);
        List<Neighbour> neighboursFavoriteList= new ArrayList<>();

String favorite= "";
        for (boolean neighbour = false ; neighbour ==false; neighbour = neighboursFavoriteList) {

        return neighboursFavoriteList;
        }

        }
    }
