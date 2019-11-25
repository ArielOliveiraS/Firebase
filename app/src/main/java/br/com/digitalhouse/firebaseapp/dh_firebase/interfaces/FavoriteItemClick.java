package br.com.digitalhouse.firebaseapp.dh_firebase.interfaces;

import br.com.digitalhouse.firebaseapp.dh_firebase.model.Result;

public interface FavoriteItemClick {

    void addFavoriteClickListener(Result result);
    void removeFavoriteClickListener(Result result);
}
