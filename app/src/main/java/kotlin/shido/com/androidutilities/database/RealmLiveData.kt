package edu.mira.aula.shared.repository

/**
 * A Realm LiveData Wrapper
 * Created by Shido on 18/10/2017.
 */
//class RealmLiveData<T : RealmModel>(private val results: RealmResults<T>) : LiveData<RealmResults<T>>() {
//
//    private val listener = RealmChangeListener<RealmResults<T>> {
//        results -> value = results
//    }
//    override fun onActive() {
//        results.addChangeListener(listener)
//    }
//
//    override fun onInactive() {
//        results.removeChangeListener(listener)
//    }
//}