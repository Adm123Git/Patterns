package ru.adm123.pattern.adapter.model;

/**
 * @author Dmitry Ushakov at 19.07.2021
 */
public class LoaderForWagonImpl implements LoaderForWagon {

    @Override
    public void loadToWagon() {
        System.out.println("loading");
    }

}
